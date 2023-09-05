class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int[] array = new int[numbers.length];
        
        for(int i=0; i<numbers.length; i++) {
            array[i] = numbers[i];
        }
        
        if(direction.equals("right")) {
            for(int i=0; i<numbers.length; i++) {
                answer[(i+1) % numbers.length] = array[i];
            }
        }
        else if(direction.equals("left")) {
            for(int i=0; i<numbers.length; i++) {
                answer[i] = array[(i+1) % numbers.length];
            }
        }
        return answer;
    }
}