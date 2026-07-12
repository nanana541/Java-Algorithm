class Solution {
    boolean solution(String s) {
        int cntp = 0, cnty = 0;
        char[] chars = s.toLowerCase().toCharArray();
        for (char c : chars){
            if (c == 'p') cntp++;
            if (c == 'y') cnty++;
        }
        if (cntp == cnty) return true;
        else return false;
    }
}