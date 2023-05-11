class Solution {
public String solution(String code) {
    int mode = 0;
    StringBuilder ret = new StringBuilder();
    
    for (int idx = 0; idx < code.length(); idx++) {
        if (code.charAt(idx) == '1') {
            mode = 1 - mode;
        } else {
            if (mode == 0 && idx % 2 == 0) {
                ret.append(code.charAt(idx));
            } else if (mode == 1 && idx % 2 == 1) {
                ret.append(code.charAt(idx));
            }
        }
    }
    
    if (ret.length() == 0) {
        return "EMPTY";
    } else {
        return ret.toString();
    }
}

}