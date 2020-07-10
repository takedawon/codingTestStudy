package two;

import java.util.Stack;

public class IronBarTest {
    public static void main(String[] args) {
            System.out.println(solution("(((()())))"));

    }
    public static int solution(String arrangement) {
        Stack<Character> stack = new Stack<>();
        int answer = 0;

        char[] test = arrangement.toCharArray();
        for (int i = 0; i < test.length; i++) {
            if (test[i] == '(') {
                stack.add('(');
                continue;
            }
            stack.pop();
            if (test[i - 1] == '(') {
                answer += stack.size();
            } else {
                answer++;
            }
        }
        return answer;
    }
}
