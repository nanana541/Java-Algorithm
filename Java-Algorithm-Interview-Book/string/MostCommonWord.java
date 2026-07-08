package string;

import java.util.*;


//금지된 단어 설정, 해당 단어 제외 가장 많이 나온 단어를 대소문자 구분하지 않고 출력(구두점 무시)
public class MostCommonWord {
    public static String mostCommonWord (String paragraph, String[] banned){
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> counts = new HashMap<>();
        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split(" ");
        for (String w : words) {
            if(!ban.contains(w)) counts.put(w, counts.getOrDefault(w, 0) + 1);
        }
        return Collections.max(counts.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        String paragraph = "Ross hit a ball, the hit BALL flew far away after it was hit.";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord(paragraph, banned));
    }
}
