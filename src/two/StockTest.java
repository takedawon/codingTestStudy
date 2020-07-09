package two;

import java.util.Arrays;

public class StockTest {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 2, 3})));
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int idx = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            int count = 0;
            int result = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int data = prices[j];
                count++;
                if (result > data) {
                    break;
                }
            }
            answer[idx++] = count;
        }
        return answer;
    }

}
