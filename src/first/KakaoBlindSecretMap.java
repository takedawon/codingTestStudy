package first;

import java.util.Arrays;

public class KakaoBlindSecretMap {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                solution(5,new int[]{9,20,28,18,11}, new int[]{30, 1, 21, 17, 28})));

        System.out.println(Arrays.toString(
                solution(6,new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10})));
    }
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i<n; i++) {
            String test = Integer.toBinaryString(arr1[i]|arr2[i]);
            StringBuilder builder1 = new StringBuilder();
            for(int j = test.length();j<n;j++) {
                builder1.append("0");
            }
            builder1.append(test);

            String[] string = String.valueOf(builder1).split("");
            StringBuilder builder2 = new StringBuilder();
            for (String str : string) {
                if(str.equals("1")) {
                    builder2.append("#");
                } else {
                    builder2.append(" ");
                }
            }
            answer[i] = builder2.toString();
        }
        return answer;
    }
}
