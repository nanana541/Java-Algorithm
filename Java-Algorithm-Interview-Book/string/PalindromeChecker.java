package string;
import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";
        for (int i = s.length()-1; i>=0; i--){
            s1 += s.charAt(i);
        }
        if (s.compareToIgnoreCase(s1) == 0) System.out.println("true");
    }
}
