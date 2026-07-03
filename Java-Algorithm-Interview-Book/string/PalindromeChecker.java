package string;
import java.util.Scanner;
public class PalindromeChecker {
    public static boolean isPalindrome(String s){
        //문자 단위로 처리, 원시 타입을 사용하여 실행시간이 빠름.
//        int start = 0, end = s.length()-1;
//        while(start < end){
//            if (!Character.isLetterOrDigit(s.charAt(start))) start++;
//            else if (!Character.isLetterOrDigit(s.charAt(end))) end--;
//            else {
//                if (Character.toLowerCase(s.charAt(start)) == Character.toLowerCase(s.charAt(end
//                ))) {
//                    start++;
//                    end--;
//                }
//                else return false;
//            }
//        }
//        return true;
        //문자열 직접 비교 내장 매서드들을 사용하여 실행 시간은 길되, 가독성이 좋음.
        String s_filtered = s.replaceAll("[^A-Z0-9a-z]","").toLowerCase();
        String s_reversed = new StringBuilder(s_filtered).reverse().toString();
        return s_filtered.equals(s_reversed);
    }
    public static void main(String[] args) {
        String test1 = "ass d";
        String test2 = "ass a";
        System.out.println(isPalindrome(test1));
        System.out.println(isPalindrome(test2));
    }
}
