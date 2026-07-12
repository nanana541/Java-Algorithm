class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int sLength = s.length();
        if (!(sLength == 4 || sLength == 6)) return false;
        for (char c : s.toCharArray()){
            if(Character.isLetter(c)) {
                return false;
            }
        }
        return answer;
    }
}