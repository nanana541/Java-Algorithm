import java.util.*;
class Solution {
   public String solution(String s) {
        StringBuilder answer = new StringBuilder(s.toLowerCase());
        boolean isFirst = true;
        for(int i = 0; i < answer.length(); i++){
            if (answer.charAt(i) == ' '){
                isFirst = true;
            }
            else {
                if(isFirst) {
                    answer.setCharAt(i, Character.toUpperCase(answer.charAt(i)));
                    isFirst = false;
                }
            }
        }
        return answer.toString();
    }
}