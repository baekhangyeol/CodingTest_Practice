import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for(int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int maxFrequency = 0;
        int mode = -1;
        boolean multipleModes = false;
        
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            
            if(frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = num;
                multipleModes = false;
            }
            else if(frequency == maxFrequency) {
                multipleModes = true;
            }
        }
        
        if(multipleModes) {
            return -1;
        }
        return mode;
    }
}