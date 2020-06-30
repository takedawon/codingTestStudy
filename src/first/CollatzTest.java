package first;

public class CollatzTest {
    public static void main(String[] args) {
        System.out.print(solution(626331));
    }
    public static int solution(int num) {
        return collatz(num,0);
    }
    public static int collatz(int num,int count) {
        if(num == 1) return count;
        else if(count>480) return -1;
        else {
            if(num%2==0) {
                return collatz(num/2,++count);
            } else {
                return collatz((num*3)+1,++count);
            }
        }
    }
}
