class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        int length = 0;
        
        for(int i=start; i<=end; i++) {
            answer[length] = i;
            length++;
        }
        return answer;
    }
}