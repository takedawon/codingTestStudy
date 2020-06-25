package first;

public class StrangeStringTest {
    public static void main(String[] args) {
        System.out.println(solution(" try hello world "));
    }
    public static String solution(String s) {
        String[] test = s.split(" ", -1);
        StringBuilder answer = new StringBuilder();
        int count = 1;
        for(String str : test) {
            char[] charStr = str.toCharArray();
            for(int i =0; i<charStr.length; i++) {
                if(i%2 == 0) {
                    charStr[i] = Character.toUpperCase(charStr[i]);
                } else {
                    charStr[i] = Character.toLowerCase(charStr[i]);
                }
            }
            answer.append(charStr);
            if(count<test.length) {
                count++;
                answer.append(" ");
            }
        }
        return answer.toString();
    }
}
