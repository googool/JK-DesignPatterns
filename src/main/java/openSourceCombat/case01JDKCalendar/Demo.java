package openSourceCombat.case01JDKCalendar;

import java.util.Calendar;

/**
 * Created by chenjinxin on 2021/4/2 上午10:03
 */
public class Demo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.HOUR));
    }
}
