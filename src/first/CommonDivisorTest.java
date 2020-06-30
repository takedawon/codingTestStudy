package first;

import java.util.Arrays;

public class CommonDivisorTest {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(solution(3,12)));
    }

    public static int[] solution(int n, int m) {
        int gcd = gcd(n,m);
        int lcm = n*m/gcd;
        return new int[]{gcd,lcm};
    }

    public static int gcd(int a, int b) {
        if(b == 0)
            return a;
        else
            return gcd(b, a%b);
    }
}
