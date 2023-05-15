class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        
        for(int[] query: queries) {
            int start = query[0];
            int end = query[1];
            int k = query[2];
            
            for(int i=start; i<=end; i++) {
                if(i%k == 0) {
                    answer[i] += 1;
                }
            }
        }
        return answer;
    }
}