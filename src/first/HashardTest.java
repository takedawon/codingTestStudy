package first;

public class HashardTest {
    public static void main(String[] args) {
        System.out.print(solution(10));
    }

    public static boolean solution(int x) {
        String str = String.valueOf(x);
        String[] arr = str.split("");
        int sum = 0;
        for (String string : arr) {
            sum += Integer.parseInt(string);
        }
        if (x % sum == 0)
            return true;
        else
            return false;
    }
}
