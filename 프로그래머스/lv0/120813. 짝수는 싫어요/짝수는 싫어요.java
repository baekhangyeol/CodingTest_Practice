class Solution {
    public int[] solution(int n) {
        int[] answer = new int [(n+1) / 2];
        int count = 0;
        
        for(int i=0; i<=n; i++) {
            if(i % 2 != 0) {
                answer[count] = i;
                count++;
            }
            else {
                continue;
            }
        }
        return answer;
    }
}