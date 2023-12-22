class Solution(object):
    def combinationSum(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        def backtrack(remaining, comb, start):
            if remaining == 0:
                result.append(list(comb))
                return
            elif remaining < 0:
                return
            
            for i in range(start, len(candidates)):
                comb.append(candidates[i])
                backtrack(remaining - candidates[i], comb, i)
                comb.pop()
                
        result = []
        backtrack(target, [], 0)
        return result