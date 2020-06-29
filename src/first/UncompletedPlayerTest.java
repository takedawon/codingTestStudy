package first;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.*;

public class UncompletedPlayerTest {
    public static void main(String[] args) {
        System.out.print(solution(new String[]{"leo", "kiki", "eden"},
                new String[]{"kiki", "eden"}));
    }

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(completion);
        Arrays.sort(participant);
        System.out.println(Arrays.toString(completion));
        System.out.println(Arrays.toString(participant));
        String answer = "";

        for(int i = 0; i<completion.length;i++) {
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            } else {
                answer = participant[i+1];
            }
        }

        return answer;
    }
}
