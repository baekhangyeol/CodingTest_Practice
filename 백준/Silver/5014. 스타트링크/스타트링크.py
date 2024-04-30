import sys
from collections import deque

input = sys.stdin.read


def main():
    data = input().split()
    F, S, G, U, D = map(int, data)

    queue = deque([S])
    visited = [-1] * (F + 1)
    visited[S] = 0

    while queue:
        current = queue.popleft()

        if current == G:
            print(visited[current])
            return

        up_floor = current + U
        if up_floor <= F and visited[up_floor] == -1:
            visited[up_floor] = visited[current] + 1
            queue.append(up_floor)

        down_floor = current - D
        if down_floor >= 1 and visited[down_floor] == -1:
            visited[down_floor] = visited[current] + 1
            queue.append(down_floor)

    print("use the stairs")


if __name__ == "__main__":
    main()
