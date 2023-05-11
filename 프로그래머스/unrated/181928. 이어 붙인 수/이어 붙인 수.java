class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int[] even = new int[100];
        int[] odd = new int[100];
        int even_sum = 0;
        int odd_sum = 0;
        int even_num = 0;
        int odd_num = 0;
        
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                even[even_num] = num_list[i];
                even_num++;
            }
            else {
                odd[odd_num] = num_list[i];
                odd_num++;
            }
        }
        for(int i=even_num; i>=0; i--) {
            even_sum += Math.pow(10, i-1) * even[even_num - i];
        }
        for(int i=odd_num; i>=0; i--) {
            odd_sum += Math.pow(10, i-1) * odd[odd_num - i];
        }
        answer = even_sum + odd_sum;
        return answer;
    }
}