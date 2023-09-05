class Solution {
    public int[][] solution(int[] num_list, int n) {
        int length = num_list.length;
        
        int rowCount = length / n;
        if(length % n != 0) {
            rowCount++;
        }
        
        int[][] answer = new int[rowCount][n];
        
        int index = 0;
        
        for(int i=0; i<rowCount; i++) {
            for(int j=0; j<n; j++) {
                if(index < length) {
                    answer[i][j] = num_list[index];
                    index++;
                }
                else {
                    break;
                }
            }
        }
        return answer;
    }
}