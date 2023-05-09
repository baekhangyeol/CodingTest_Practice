class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int awer = 0;
        int bwer = 0;
        int ac = 0;
        int bc = 0;
        
        if(b / 10000 == 0)
            ac = 1000;
        if(b / 1000 == 0)
            ac = 100;
        if(b / 100 == 0)
            ac = 10;
        if(b / 10 == 0)
            ac = 1;
        
        if(a / 10000 == 0)
            bc = 1000;
        if(a / 1000 == 0)
            bc = 100;
        if(a / 100 == 0)
            bc = 10;
        if(a / 10 == 0)
            bc = 1;
        
        bwer = a + b*10*bc;
        awer = a*10*ac + b;
        
        if(bwer > awer) {
            answer = bwer;
        }
        else if(bwer < awer)
            answer = awer;
        else if(bwer == awer)
            answer = awer;
        
        
        return answer;
    }
}