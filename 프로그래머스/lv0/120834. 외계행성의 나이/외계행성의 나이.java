class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();

        while(age > 0) {
            int digit = age % 10;
            char alphabet = (char) ('a' + digit);
            sb.insert(0, alphabet);
            age /= 10;
        }
        
        return sb.toString();
    }
}