package first;

import java.util.Arrays;

public class Summer2018Test {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,2,5,4},9));
        System.out.println(solution(new int[]{1,3,2,5,4},10));
    }
    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i = 0; i<d.length; i++) {
            if(d[i]<=budget){
                budget-=d[i];
                answer++;
            }
        }
        return answer;
    }
}
