package first;

import java.util.Arrays;
import java.util.Comparator;

public class StringSortTest {
    public static void main(String[] args) {
        String[] arr = {"sun", "bed", "car"};
        String[] arr2 = {"abce", "abcd", "cdx"};
        System.out.println(Arrays.toString(solution(arr, 1)));
        System.out.println(Arrays.toString(solution(arr2, 2)));
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = strings;
        Arrays.sort(answer, (o1, o2) -> {
            if(o1.charAt(n) == o2.charAt(n)) {
                return o1.compareTo(o2);
            } else {
                return Character.compare(o1.charAt(n), o2.charAt(n));
            }
        });
        return answer;
    }
}
