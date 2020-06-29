package first;

import java.util.Stack;

public class ClawMachineGameTest {
    public static void main(String[] args) {
        System.out.print(
                solution(new int[][]{
                                {0, 0, 0, 0, 0, 0},
                                {0, 0, 1, 0, 3, 0},
                                {0, 2, 5, 0, 1, 0},
                                {4, 2, 4, 4, 2, 0},
                                {3, 5, 1, 3, 1, 0}},
                        new int[]{1, 5, 3, 5, 1, 2, 1, 4}));
    }

    public static int solution(int[][] board, int[] moves) {
        Stack<Integer> storageBox = new Stack();
        int count = 0;
        storageBox.push(0);
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][move - 1] != 0) {
                    if (storageBox.peek() == board[i][move - 1]) {
                        count+=2;
                        storageBox.pop();
                    } else {
                        storageBox.push(board[i][move - 1]);
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        return count;
    }
}
