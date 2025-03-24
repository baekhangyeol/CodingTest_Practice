from itertools import permutations


def main():
    X = input().strip()
    x_int = int(X)

    # 모든 순열 생성
    perm = set(permutations(X))

    # 가능한 후보 중 X보다 큰 수만 리스트로 추림
    candidates = [int(''.join(p)) for p in perm if int(''.join(p)) > x_int]

    if candidates:
        print(min(candidates))
    else:
        print(0)


if __name__ == "__main__":
    main()