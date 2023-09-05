class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = 0;
        int length = numbers.length;
        
        System.out.println(2 % 4);
        
        while(k > 1) {
            index = (index + 2) % length;
            k--;
        }
        return numbers[index];
    }
}