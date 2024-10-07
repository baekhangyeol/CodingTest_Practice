import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> clothMap = new HashMap<>();
        
        for(String[] cloth: clothes) {
            String type = cloth[1];
            clothMap.put(type, clothMap.getOrDefault(type, 0) + 1);
        }
                
        int answer = 1;
        for(int count: clothMap.values()) {
            answer *= (count + 1);
        }
                
        return answer - 1;
    }
}