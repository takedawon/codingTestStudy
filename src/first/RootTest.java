package first;

public class RootTest {
    public static void main(String[] args) {
        System.out.println(solution(121));
    }

    public static long solution(long n) {
        Double sqrt = Math.sqrt(n);
        System.out.println("sqrt " + sqrt + " == sqrt.intValue() " + sqrt.intValue());
        if(sqrt == sqrt.intValue()) {
            return (long) Math.pow(sqrt+1,2);
        }
        return -1;
    }
}
