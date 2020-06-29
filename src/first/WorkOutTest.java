package first;

public class WorkOutTest {
    public static void main(String[] args) {
        System.out.print(solution(6, new int[]{1, 2}, new int[]{2, 3}));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int count = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            if (lost[i] != -1) {
                for (int j = 0; j < reserve.length; j++) {
                    if (reserve[j] != -1) {
                        if (lost[i] == reserve[j]) {
                            lost[i] = -1;
                            reserve[j] = -1;
                            count++;
                        }
                    }
                }
            }
        }


        for (int i : lost) {
            if (i != -1) {
                for (int j = 0; j < reserve.length; j++) {
                    if (reserve[j] != -1) {
                        if (i == reserve[j] + 1 || i == reserve[j] - 1 || i == reserve[j]) {
                            count++;
                            reserve[j] = -1;
                            break;
                        }
                    }
                }
            }
        }
        return count;
    }
}

