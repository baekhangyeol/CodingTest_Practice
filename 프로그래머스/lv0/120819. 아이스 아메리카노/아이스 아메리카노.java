class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int num, mon = 0;
        
        num = money / 5500;
        mon = money % 5500;
        
        answer[0] = num;
        answer[1] = mon;
        
        return answer;
    }
}