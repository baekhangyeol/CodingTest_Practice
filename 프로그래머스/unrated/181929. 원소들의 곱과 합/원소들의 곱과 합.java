class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul_num = 1;
        int plus_num = 0;
        
        for(int i=0; i<num_list.length; i++) {
            mul_num *= num_list[i];
            plus_num += num_list[i];
        }
        
        if(mul_num < Math.pow(plus_num, 2))
            answer = 1;
        
        return answer;
    }
}