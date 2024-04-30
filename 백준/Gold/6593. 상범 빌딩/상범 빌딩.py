import sys
from collections import deque

def bfs(start, exit, L, R, C, building):
    directions = [(1, 0, 0), (-1, 0, 0), (0, 1, 0), (0, -1, 0), (0, 0, 1), (0, 0, -1)]
    queue = deque([(start[0], start[1], start[2], 0)])
    visited = [[[False for _ in range(C)] for _ in range(R)] for _ in range(L)]
    visited[start[0]][start[1]][start[2]] = True

    while queue:
        l, r, c, minutes = queue.popleft()

        if (l, r, c) == exit:
            return minutes

        for dl, dr, dc in directions:
            nl, nr, nc = l + dl, r + dr, c + dc
            if 0 <= nl < L and 0 <= nr < R and 0 <= nc < C:
                if not visited[nl][nr][nc] and building[nl][nr][nc] != '#':
                    visited[nl][nr][nc] = True
                    queue.append((nl, nr, nc, minutes + 1))

    return -1

def main():
    input_data = sys.stdin.read()
    results = []
    input_lines = input_data.strip().split('\n')
    index = 0

    while index < len(input_lines):
        if input_lines[index].strip() == "":
            index += 1
            continue
        try:
            L, R, C = map(int, input_lines[index].split())
        except ValueError:
            break  # 이 경우는 입력 형식이 잘못되었을 때를 처리합니다.
        index += 1
        if L == 0 and R == 0 and C == 0:
            break

        building = []
        start = exit = None
        for l in range(L):
            layer = []
            for r in range(R):
                row = input_lines[index].strip()
                if 'S' in row:
                    start = (l, r, row.index('S'))
                if 'E' in row:
                    exit = (l, r, row.index('E'))
                layer.append(row)
                index += 1
            building.append(layer)
            if index < len(input_lines) and input_lines[index].strip() == "":
                index += 1  # 빈 줄 처리

        minutes = bfs(start, exit, L, R, C, building)
        if minutes == -1:
            results.append("Trapped!")
        else:
            results.append(f"Escaped in {minutes} minute(s).")

    for result in results:
        print(result)

if __name__ == "__main__":
    main()
