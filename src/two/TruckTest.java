package two;

import java.util.LinkedList;

public class TruckTest {
    public static void main(String[] args) {
        System.out.println(solution(2, 10, new int[]{7, 4, 5, 6}));
        System.out.println(solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int index = 0;
        int check = 0;
        int now = 0;
        LinkedList<Integer> queue = new LinkedList<>();
        LinkedList<Integer> delay = new LinkedList<>();
        queue.add(truck_weights[index]);
        delay.add(1);
        now += truck_weights[index++];
        answer++;

        while (!queue.isEmpty()) {
            for(int i = check; i<delay.size();i++) {
                if (delay.get(i) == bridge_length) {
                    now -= queue.pop();
                    check++;
                } else {
                    delay.set(i, (delay.get(i) + 1));
                }
            }

            if (index < truck_weights.length) {
                if (weight - now >= truck_weights[index]) {
                    queue.add(truck_weights[index]);
                    now += truck_weights[index++];
                    delay.add(1);
                }
            }

            answer++;
        }

        return answer;
    }
}
