package string;
import java.util.*;
//문자열 배열을 받아, 애너그램 단위로 그룹화
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> results = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if (!results.containsKey(key)) results.put(key, new ArrayList<>());
            results.get(key).add(s);
        }
        return new ArrayList<>(results.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "ant", "cat"};
        System.out.println(groupAnagrams(strs));
    }
}
