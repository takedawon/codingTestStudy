package first;

import java.util.Arrays;
import java.util.Comparator;

public class IntDescendingSortTest
{
    public static void main(String[] args) {
        System.out.print(solution(118372));
    }
    public static long solution(long n) {
        String[] number = String.valueOf(n).split("");
        StringBuilder stringBuilder = new StringBuilder();
    // Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        Arrays.sort(number, Comparator.reverseOrder());

        for(String str : number) {
            stringBuilder.append(str);
        }
        return Long.parseLong(stringBuilder.toString());
    }
}
