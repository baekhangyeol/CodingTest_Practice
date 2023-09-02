class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        answer = n * 12000 + k * 2000;
        
        int free = n / 10;
        
        if(free > 0) {
            answer -= free * 2000;
        }
        
        return answer;
    }
}