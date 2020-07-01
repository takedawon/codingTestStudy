package first;

import java.util.*;

public class KakaoBlind2019Test {
    public static void main(String[] args) {
        System.out.print(Arrays.toString(solution(5, new int[]{2,1,2,6,2,4,3,3})));
        System.out.print(Arrays.toString(solution(5, new int[]{5,5,5,4,4,4,1,3})));
    }
    public static int[] solution(int N, int[] stages) {
        HashMap<Integer,Double> hash = new HashMap();
        double userNum = stages.length;
        for (int i = 1; i<=N; i++) {
            int count = 0;
            for (int j=1; j<=stages.length;j++) {
                if(i==stages[j-1]) {
                    count++;
                }
            }
            if(userNum != 0) {
                hash.put(i, count / userNum);
            } else {
                hash.put(i, 0.0);
            }
            System.out.println("count : " + count + " userNum : " + userNum + " i : " + i + " percent : " + count/userNum);
            userNum-=count;
        }

        List<Integer> list = new ArrayList(hash.keySet());
        Collections.sort(list, (o1, o2) -> hash.get(o2).compareTo(hash.get(o1)));

        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
