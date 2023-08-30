class Solution {
    public int solution(int n) {
        int needPizza = 0;
        
        if(n > 7 && n % 7 != 0) {
            needPizza = n / 7 + 1;
        }
        else if(n > 7 && n % 7 == 0) {
            needPizza = n / 7;
        }
        else if(n <= 7) {
            needPizza = 1;
        }
        
        return needPizza;
    }
}