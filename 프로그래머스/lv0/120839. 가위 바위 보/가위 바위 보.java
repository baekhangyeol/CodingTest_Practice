class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<rsp.length(); i++) {
            String a = String.valueOf(rsp.charAt(i));
            if(a.equals("2")) {
                sb.append("0");
            }
            else if(a.equals("0")) {
                sb.append("5");
            }
            else if(a.equals("5")) {
                sb.append("2");
            }
        }
        return sb.toString();
    }
}