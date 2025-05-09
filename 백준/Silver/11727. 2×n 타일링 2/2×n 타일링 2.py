def main():
    n = int(input())

    dp = [0] * (n + 1)
    dp[1] = 1

    if n >= 2:
        dp[2] = 3

    # 마지막에 2x1 타일을 세로로 놓았을 때 -> 1칸에만 들어감, 즉 한 칸만 비워져있어야 함 (i-1)
    # 마지막에 2x1 타일을 가로로 2개 놓았을 때 -> 2칸에 들어감, 즉 두 칸 비워져있어야 함 (i-2)
    # 마지막에 2x2 타일을 놓았을 때 -> 2칸에 들어감, 마찬가지로 두 칸 비워져있어야 함 (i-2)
    for i in range(3, n + 1):
        dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007

    print(dp[n])


if __name__ == "__main__":
    main()