package two;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class FunctionalDevelopmentTest {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55, 60, 55,55}, new int[]{1, 30, 5,5,5,5})));
        System.out.println(Arrays.toString(solution(new int[]{40, 93, 30, 55, 60, 65}, new int[]{60, 1, 30, 5 , 10, 7})));
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55, 60, 40, 65}, new int[]{1, 30, 5 , 10, 60, 7})));

    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int std = 0;
        LinkedList<Integer> list = new LinkedList<>();
        while (progresses[std] < 100) {
            int count = 0;
            for(int i = std;i<progresses.length; i++) {
                progresses[i]+=speeds[i];
            }
            if(progresses[std] >= 100) {
                for(int i = std; i<progresses.length;i++) {
                    if(progresses[i]>=100) {
                        count++;
                    } else {
                        std=i;
                        break;
                    }
                }
                list.add(count);
                for(int i = std; i<progresses.length;i++) {
                    if(progresses[i]<100) {
                        break;
                    }
                }
            }
        }
        int[] counts = new int[list.size()];
        int cnt =0;
        while (!list.isEmpty()) {
            counts[cnt++] = list.pop();
        }
        return counts;
    }
}