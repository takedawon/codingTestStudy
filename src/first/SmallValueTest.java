package first;

import java.util.Arrays;

public class SmallValueTest {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(solution(new int[]{4,3,2,1})));
        System.out.print(Arrays.toString(solution(new int[]{1,2,3,4})));
    }
    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i > min).toArray();
    }
}
