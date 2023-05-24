class Solution {
    public int solution(String number) {
        int sum = 0;
        for(char c : number.toCharArray()) {
            int digit = Character.getNumericValue(c);
            sum += digit;
        }
        
        int answer = sum % 9;
        
        return answer;
    }
}