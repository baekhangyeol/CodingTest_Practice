def solution(m, n, puddles):
    
    dp = [[0] * (m + 1) for _ in range(n + 1)]
    
    dp[1][1] = 1
    
    puddleSet = set()
    
    for puddle in puddles:
        puddleSet.add(tuple(puddle))
    
    for i in range(1, n+1):
        for j in range(1, m+1):
            if (j, i) in puddleSet:
                dp[i][j] = 0
            elif i == 1 and j == 1:
                continue
            else:
                dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1000000007
            
    return dp[n][m]