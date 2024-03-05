def find_winner(N):
    dp = [False] * (N + 1)

    dp[1] = True
    if N > 1:
        dp[2] = False
    if N > 2:
        dp[3] = True

    for i in range(4, N + 1):
        dp[i] = not dp[i - 1] or not dp[i - 3]

    return 'SK' if dp[N] else 'CY'

print(find_winner(int(input())))