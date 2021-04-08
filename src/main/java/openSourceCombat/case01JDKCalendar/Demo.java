package openSourceCombat.case01JDKCalendar;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by chenjinxin on 2021/4/2 上午10:03
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(new Date());

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));

        switch (calendar.get(Calendar.AM_PM)){
            case Calendar.AM:
                System.out.println("上午");
                break;
            case Calendar.PM:
                System.out.println("下午");
                break;
        }

        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));// 24小时制
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.MILLISECOND));
    }
}
