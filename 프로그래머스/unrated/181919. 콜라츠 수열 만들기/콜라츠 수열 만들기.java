class Solution {
    public int[] solution(int n) {
        int count = 1;
        int tempN = n;
        
        while(tempN != 1) {
            if(tempN % 2 == 0) {
                tempN = tempN / 2;
                count++;
            }
            else if(tempN % 2 != 0) {
                tempN = 3*tempN+1;
                count++;
            }
        }
        
        int[] answer = new int[count];
        
        for(int i=0; i<count; i++) {
            if(i == 0) {
                answer[i] = n;
                continue;
            }
            if(n % 2 == 0) {
                n = n / 2;
                answer[i] = n;
            }
            else if(n % 2 != 0) {
                n = 3*n + 1;
                answer[i] = n;
            }
            if(n == 1) {
                answer[i] = 1;
                break;
            }
        }
        return answer;
    }
}