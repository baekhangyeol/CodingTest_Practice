import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        Integer[] sortedEmergency = new Integer[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            sortedEmergency[i] = emergency[i];
        }
        
        Arrays.sort(sortedEmergency, Collections.reverseOrder());
                
        int index = 0;
        int num = emergency.length;
        for(int i=0; i<emergency.length; i++) {
            for(int j=0; j<emergency.length; j++) {
                if(emergency[i] == sortedEmergency[j]) {
                    answer[index++] = j+1;
                    break;
                }
            }
        }
        
        return answer;
    }
}