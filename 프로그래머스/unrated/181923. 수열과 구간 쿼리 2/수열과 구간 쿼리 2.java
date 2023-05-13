class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int i = 0; i < queries.length; i++) {
            int min = queries[i][0];
            int max = queries[i][1];
            int target = queries[i][2];
            int temp = -1;
            
            for(int j = min; j <= max; j++) {
                if(arr[j] > target) {
                    if(temp == -1 || arr[j] < temp) {
                        temp = arr[j];
                    }
                }
            }
            
            answer[i] = temp;
        }
        
        return answer;
    }
}
