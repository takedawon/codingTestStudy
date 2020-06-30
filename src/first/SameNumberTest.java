package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SameNumberTest {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(solution(new int[]{4,4,4,4,3,3})));
    }

    public static int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList();
        int num = -1;
        for(int number : arr) {
            if(num!=number) {
                list.add(number);
                num = number;
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
