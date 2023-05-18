class Solution {
    public int[] solution(int l, int r) {
        int count = 0;
        
        for(int i=l; i<=r; i++) {
            if(containsOnly05(i)) {
                count++;
            }
        }
        if(count == 0) {
            return new int[]{-1};
        }
        
        int[] answer = new int[count];
        int index = 0;
        
        for(int i=l; i<=r; i++) {
            if(containsOnly05(i)) {
                answer[index++] = i;
            }
        }
        return answer;
    }
    
    private boolean containsOnly05(int number) {
        while(number > 0) {
            int digit = number % 10;
            
            if(digit != 0 && digit != 5) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}