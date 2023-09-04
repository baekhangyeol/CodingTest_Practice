class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        for(int i=5; i>0; i -= 2) {
            int a = hp / i;
            answer += a;
            if(a > 0) {
                hp = hp - a*i;
            }
        }
        return answer;
    }
}