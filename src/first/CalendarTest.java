package first;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016,4,24);
        int a = calendar.get(Calendar.DAY_OF_WEEK)-1;
        System.out.print(day[a]);
    }
}
