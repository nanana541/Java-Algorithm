import java.util.*;
class Solution {
     public int solution(String s) {
        if (s.length() == 1) return  1;
        int answer = 1010;
        for (int step = 1; step < s.length() / 2 + 1; step++){
            int cnt = 0, length = s.length();
            List<String> strs = new ArrayList<>();
            for (int j = 0; j < s.length(); j+=step){
                if (j+step < s.length())  strs.add(s.substring(j, j+step));
                else strs.add(s.substring(j));
            }
            boolean succ = false;
            for (int i = 0; i < strs.size()-1; i++){
                if (strs.get(i).equals(strs.get(i+1))) {
                    cnt++;
                    succ = true;
                }
                else {
                    if (succ) length = length - cnt*step + String.valueOf(cnt+1).length();
                    succ = false;
                    cnt = 0;
                }
            }
            if (succ) length = length - cnt*step + String.valueOf(cnt+1).length();
            if (answer > length) answer = length;
        }
        return answer;
    }
}