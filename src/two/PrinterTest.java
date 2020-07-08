package two;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class PrinterTest {
    public static void main(String[] args) {
        PrinterTest printer = new PrinterTest();
        //System.out.println(printer.solution(new int[]{1, 2, 3, 2}, 2));
        System.out.println(printer.solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(printer.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
        System.out.println(printer.solution(new int[]{4,3,4,4}, 2));
    }

    public int solution(int[] priorities, int location) {
        LinkedList<Data> list = new LinkedList<>();
        int answer = 0;
        for (int i = 0; i < priorities.length; i++) {
            if (location == i) {
                list.add(new Data(priorities[i], true));
            } else {
                list.add(new Data(priorities[i], false));
            }
        }

        while(!list.isEmpty()) {
            Data s = list.pop();
            Boolean test = true;
            //        System.out.println(printer.solution(new int[]{2, 1, 3, 2}, 2));
//        System.out.println(printer.solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
            //System.out.println(printer.solution(new int[]{4,3,4,4}, 2));
            for (Data data : list) {
                if (s.number < data.number) { // 1322
                    list.add(s);
                    test = false;
                    break;
                }
            }
            System.out.print(s.number + "(" + s.leader + "), ");
            if(test && !s.leader) {
                answer++;
            } else if(test && s.leader) {
                answer++;
                break;
            }
        }
        /**
         *  1 2 3 2
         *  2 3 2 1
         *  3 2 1 2
         *  2 1 2
         *  1 2
         *  2 1
         *  1
         */


        return answer;
    }

    class Data implements Comparable<Data> {
        int number;
        boolean leader;

        Data(int number, boolean leader) {
            this.number = number;
            this.leader = leader;
        }

        @Override
        public int compareTo(Data o) {
            if (this.number > o.number) {
                return -1;
            } else if (this.number < o.number) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
