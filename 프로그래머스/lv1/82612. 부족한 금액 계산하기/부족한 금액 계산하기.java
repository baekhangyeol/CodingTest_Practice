class Solution {
    public long solution(int price, int money, int count) {
        long requiredMoney = 0;
        for(int i = 1; i <= count; i++) {
            requiredMoney += price * i;
        }
        return Math.max(requiredMoney - money, 0);
    }
}
