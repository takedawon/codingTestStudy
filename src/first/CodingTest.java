package first;


import java.util.Arrays;

public class CodingTest {
    public static void main(String[] args) {
        int[] a = {1, 5, 2, 6, 3, 7, 4};
        int[][] b = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] c = solution(a, b);

        System.out.println(Arrays.toString(c));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int pos = 0;
        int j;

        for (int[] command : commands) {
            int[] imsi = new int[command[1]-(command[0]-1)];
            j = 0;
            for (int i = command[0] - 1; i < command[1]; i++) {
                imsi[j++] = array[i];
            }
            //System.out.println(Arrays.toString(imsi));
            Arrays.sort(imsi);
            //System.out.println(Arrays.toString(imsi));
            answer[pos++] = imsi[command[2]-1];
        }
        return answer;
    }
}


