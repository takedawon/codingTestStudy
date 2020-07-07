package two;

import java.util.*;

public class TopTest {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(solution(new int[]{100,10,10,10})));
    }
    public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        int now = 0;
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> copy;

        for(int i = 0; i < heights.length; i++) {
            stack.add(heights[i]);
            answer[i]=0;
        }

        while(!stack.isEmpty()) {
            now = stack.pop();
            copy = (Stack<Integer>) stack.clone();
            int idx = stack.size();
            while(!copy.isEmpty()) {
                int result = copy.pop();
                if(now<result) {
                    answer[idx] = copy.size()+1;
                    break;
                }
            }
        }
        return answer;
    }
}
