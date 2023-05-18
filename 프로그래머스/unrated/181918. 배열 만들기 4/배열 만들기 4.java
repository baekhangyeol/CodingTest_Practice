class Solution {
    public int[] solution(int[] arr) {
        int[] stk = new int[arr.length];
        int i = 0;
        int count = 0;
        
        while(i < arr.length) {
            if(count == 0 || stk[count-1] < arr[i]) {
                stk[count] = arr[i];
                count++;
                i++;
            }
            else {
                count--;
            }
        }
        int[] result = new int[count];
        for(int j=0; j<count; j++) {
            result[j] = stk[j];
        }
        return result;
    }
}