min_value = 1e9
max_value = -1e9

def main():
    N = int(input())
    A = list(map(int, input().split()))[:N]
    operator = list(map(int, input().split()))[:4]

    def dfs(i, now):
        global min_value, max_value

        if i == N:
            min_value = min(min_value, now)
            max_value = max(max_value, now)
        else:
            if operator[0] > 0:
                operator[0] -= 1
                dfs(i + 1, now + A[i])
                operator[0] += 1
            if operator[1] > 0:
                operator[1] -= 1
                dfs(i + 1, now - A[i])
                operator[1] += 1
            if operator[2] > 0:
                operator[2] -= 1
                dfs(i + 1, now * A[i])
                operator[2] += 1
            if operator[3] > 0:
                operator[3] -= 1
                dfs(i + 1, int(now / A[i]))
                operator[3] += 1

    dfs(1, A[0])

    print(max_value)
    print(min_value)

if __name__ == "__main__":
    main()