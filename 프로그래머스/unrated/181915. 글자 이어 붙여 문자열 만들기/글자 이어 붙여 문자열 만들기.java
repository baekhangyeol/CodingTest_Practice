class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<index_list.length; i++) {
            int a = index_list[i];
            sb.append(my_string.charAt(a));
        }
                
        return sb.toString();
    }
}