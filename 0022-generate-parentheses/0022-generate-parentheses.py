class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        result = []
        
        def generate(s = '', left=0, right=0):
            if len(s) == 2 * n:
                result.append(s)
            else:
                if left < n:
                    generate(s + '(', left + 1, right)
                if right < left:
                    generate(s + ')', left, right + 1)
                    
        generate()
        return result