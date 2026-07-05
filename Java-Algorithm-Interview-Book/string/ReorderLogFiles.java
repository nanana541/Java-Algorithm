package string;

import java.util.*;
// 맨 앞은 식별자임으로 정렬에 영향 x, 문자가 숫자보다 앞에 옴, 문자는 사전순으로 정렬, 숫자는 입력 순서대로
public class ReorderLogFiles {
    public static String[] reorder(String[] logs){
        List<String> letterList = new ArrayList<>();
        List<String> digitList = new ArrayList<>();
        for (String log : logs) {
            if (Character.isDigit(log.split(" ")[1].charAt(0))) digitList.add(log);
            else letterList.add(log);
        }
        letterList.sort((s1, s2) -> {
            String[] s1x = s1.split(" ", 2);
            String[] s2x = s2.split(" ", 2);
            int compared = s1x[1].compareTo(s2x[1]);
        if (compared == 0) return s1x[0].compareTo(s2x[0]);
        else return  compared;
        });
        letterList.addAll(digitList);
        return letterList.toArray((new String[0]));
    }

    public static void main(String[] args) {
        String[] s = {"id1 8", "id2 art can", "id3 3", "id4 own kit dig", "id5 art zero"};
        String[] reorderS = reorder(s);
        System.out.println(Arrays.toString(reorderS));
    }
}
