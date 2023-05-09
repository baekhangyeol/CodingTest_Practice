class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int awer = 0;
        int ac = 0;
        
        if(b / 10000 == 0)
            ac = 1000;
        if(b / 1000 == 0)
            ac = 100;
        if(b / 100 == 0)
            ac = 10;
        if(b / 10 == 0)
            ac = 1;
        
        awer = a*10*ac + b;
        
        if(2*a*b > awer) {
            answer = 2*a*b;
        }
        else if(2*a*b < awer)
            answer = awer;
        else if(2*a*b == awer)
            answer = awer;
        
        
        return answer;
    }
}