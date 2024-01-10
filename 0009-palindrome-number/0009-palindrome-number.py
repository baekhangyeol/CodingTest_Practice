class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0:
            return False
        
        reversed_num = 0
        original_num = x
        while x > 0:
            reversed_num = reversed_num * 10 + x % 10
            x //= 10
            
            
        return original_num == reversed_num