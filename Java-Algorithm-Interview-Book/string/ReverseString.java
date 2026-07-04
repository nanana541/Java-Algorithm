package string;
//문제: 문자열 뒤집는 함수 작성, 입력값은 문자 배열, 리턴 없이 배열 내부를 조작
public class ReverseString {
    public static void reverse(char[] s){
        int start = 0, end = s.length-1;
        while (start < end){
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++; end--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'a', 's', 'd', 'f'};
        reverse(s);
        System.out.println(s);
    }
}
