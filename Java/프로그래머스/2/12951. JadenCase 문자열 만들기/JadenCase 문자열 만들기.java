import java.util.*;
// 문자열에 특정 인덱스를 바꾸고 싶다? 문자열에 더하는 방식 사용 가능
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