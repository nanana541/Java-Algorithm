class Solution {
    public int solution(String t) {
       int answer = 0;
       boolean sepStr = false;
       while (t.length() > 1) {
           int cnt1 = 0, cnt2 = 0;
           sepStr = false;
           for (int i = 0; i < t.length(); i++) {
               if (t.charAt(0) == t.charAt(i)) cnt1++;
               else cnt2++;
               if (cnt1 == cnt2) {
                   t = t.substring(i + 1);
                   answer++;
                   sepStr = true;
                   break;
               }
           }
           if (!sepStr) break;
       }
        if (t.length() == 1 || !sepStr){
            answer++;
        }
       return answer;
    }
}