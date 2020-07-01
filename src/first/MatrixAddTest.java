package first;

import java.util.Arrays;

public class MatrixAddTest {
    public static void main(String[] args) {
        System.out.print(Arrays.deepToString(solution(new int[][]{{1, 2}, {2, 3}},
                new int[][]{{3, 4}, {5, 6}})));

        System.out.print(Arrays.deepToString(solution(new int[][]{{1},{2}},
                new int[][]{{3},{4}})));
    }
    int[][] a = new int[][]{{1,2},{2,3}};
    /*
         arr1	 arr2	return
         [1,2], [3,4],  [4,6],
         [2,3], [5,6],  [7,9]

          [[1],   [[3],    [[4]
           [2]],   [4]],    [6]]
     */
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i=0; i<arr1.length;i++) {
            for(int j=0; j<arr1[0].length;j++) {
                int x=0;
                x+=arr1[i][j] + arr2[i][j];
                answer[i][j] = x;
            }
        }
        return answer;
    }
}
