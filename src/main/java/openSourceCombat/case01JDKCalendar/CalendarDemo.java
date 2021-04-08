package openSourceCombat.case01JDKCalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by chenjinxin on 2021/4/2 下午5:59
 */
public class CalendarDemo {
    public static void main(String[] args) {
        fun6();
    }

    // 实例化当前时间
    private static void fun1() {
        Date date = new Date();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        System.out.println(date);// Fri Apr 02 18:00:53 CST 2021
        System.out.println(calendar);// java.util.GregorianCalendar[time=1617357653387,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=29,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2021,MONTH=3,WEEK_OF_YEAR=14,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=92,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=6,HOUR_OF_DAY=18,MINUTE=0,SECOND=53,MILLISECOND=387,ZONE_OFFSET=28800000,DST_OFFSET=0]
    }

    // 实例化特定时间
    private static void fun2() {
        //注：mm:ss必须小写，否则无法转换。HH大小写无影响。
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = null;
        try {
            date = df.parse("2021-08-07 11:11:11");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        java.util.Calendar calendar1 = java.util.Calendar.getInstance();
        assert date != null;
        calendar1.setTime(date);
    }

    // Date和Calendar互相转化
    private static void fun3() {
        Date date = new Date();
        java.util.Calendar instance = java.util.Calendar.getInstance();
        instance.setTime(date);
        Date time = instance.getTime();
    }

    // 格式化时间
    private static void fun4() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String s = df.format(new Date());
    }

    // 对日期进行操作。即日期加减：年月日以及小时分秒等
    private static void fun5() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        Date date = new Date();
        System.out.println(df.format(date));// 2021-04-08 20:38:58

        java.util.Calendar instance = java.util.Calendar.getInstance();
        instance.setTime(date);
        instance.add(java.util.Calendar.DATE, 60);
        Date time = instance.getTime();
        System.out.println(df.format(time));// 2021-06-07 20:38:58
    }

    // 其他常用方法
    // 获取当天结束时间：59分59秒0毫秒
    private static void fun6(){
        java.util.Calendar calendar = new GregorianCalendar();
        calendar.set(java.util.Calendar.HOUR_OF_DAY, 23);
        calendar.set(java.util.Calendar.MINUTE, 59);
        calendar.set(java.util.Calendar.SECOND, 59);
        calendar.set(java.util.Calendar.MILLISECOND, 0);
        System.out.println(calendar.getTime());
    }
}


