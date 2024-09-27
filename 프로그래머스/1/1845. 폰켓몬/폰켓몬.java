import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        int max = nums.length / 2;

        return Math.min(numSet.size(), max);
    }
}   