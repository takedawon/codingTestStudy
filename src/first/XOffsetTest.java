package first;

import java.util.Arrays;

public class XOffsetTest {
    /*
        x	n	answer
        2	5	[2,4,6,8,10]
        4	3	[4,8,12]
        -4	2	[-4, -8]
     */
    public static void main(String[] args) {
        System.out.print(Arrays.toString(solution(2,5)));
        System.out.println();
        System.out.print(Arrays.toString(solution(4,3)));
        System.out.println();
        System.out.print(Arrays.toString(solution(-4,1)));
        System.out.println();
        System.out.print(Arrays.toString(solution(1,1)));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long result=x;
        for(int i=0;i<n;i++) {
            answer[i] = result*(i+1);
        }
        return answer;
    }
}
