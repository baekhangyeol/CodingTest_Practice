def main():

    N, M = map(int, input().split())

    def backtrack(start, sequence):
        if len(sequence) == M:
            print(' '.join(map(str, sequence)))
            return

        for i in range(start, N+1):
            backtrack(i+1, sequence+[i])

    backtrack(1, [])


if __name__ == '__main__':
    main()