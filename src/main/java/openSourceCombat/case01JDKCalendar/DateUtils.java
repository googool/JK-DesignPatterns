package openSourceCombat.case01JDKCalendar;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.junit.platform.commons.util.StringUtils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by chenjinxin on 2021/4/8 上午10:45
 */
public class DateUtils {
    public static final String MMddHHmmss = "MM-dd HH:mm:ss";
    public static final String yyyyMMddHHmmss = "yyyy-MM-dd HH:mm:ss";
    public static final String yyyy_MM_dd = "yyyy-MM-dd";
    public static final String yyyyMMdd = "yyyy.MM.dd";
    public static final String HHmm = "HH:mm";
    public static final String MM_dd = "MM-dd";
    public static final String yyyy_MM_dd_other = "yyyy-MM-dd";
    private static final Logger logger = LoggerFactory.getLogger(DateUtils.class);

    public static void main(String[] args) {

    }

    public enum DateUnit {
        YEAR(Calendar.YEAR),
        MONTH(Calendar.MONTH),
        WEEK(Calendar.MONTH),
        DAY(Calendar.DAY_OF_YEAR),
        HOUR(Calendar.HOUR_OF_DAY),
        MINUE(Calendar.MINUTE),
        SECOND(Calendar.SECOND);

        private int unit;

        DateUnit(int unit) {
            this.unit = unit;
        }

        public int getUnit() {
            return unit;
        }

        public void setUnit(int unit) {
            this.unit = unit;
        }
    }

    /**
     * 根据基础时间(base),单位(unit),偏移量(differ)对时间进行偏移并返回偏移后的时间
     *
     * @param base
     * @param forward 向前
     * @param unit
     * @param differ
     * @return
     */
    public static Date shiftDate(Date base, boolean forward, DateUnit unit, int differ) {
        if (base == null) {
            return null;
        }
        if (differ <= 0) {
            return base;
        }

        Calendar instance = Calendar.getInstance();
        instance.setTime(base);
        instance.set(unit.getUnit(), instance.get(unit.getUnit()) + (forward ? differ : -differ));
        return instance.getTime();
    }

    /**
     * 日期格式化为字符串
     *
     * @param date
     * @param format
     * @return
     */
    public static String formatDate(Date date, String format) {
        if (date == null) {
            return null;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
            return simpleDateFormat.format(date);
        } catch (Exception e) {
            logger.error("日期格式化失败，date={}", date, e);
            return null;
        }
    }

    /**
     * 字符串格式化为日期
     * @param dateStr
     * @param format
     * @return
     */
    public static Date parseDate(String dateStr, String format) {
        DateFormat df = new SimpleDateFormat(format);
        if (StringUtils.isBlank(dateStr)) {
            return null;
        }

        try {
            return df.parse(dateStr.trim());
        } catch (ParseException e) {
            logger.warn("ParseException日期异常1,参数dateStr={" + dateStr + "},format={" + format + "}");
            return null;
        } catch (Exception e) {
            logger.warn("ParseException日期异常2,参数dateStr={" + dateStr + "},format={" + format + "}");
            return null;
        }
    }

    /**
     * 获取当天指定时间（时-分-秒）的日期
     * @param hours
     * @return
     */
    public static Date getSpecialHms(Date date, int hours, int minutes, int seconds) {
        if(date == null){
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, hours);
        cal.set(Calendar.MINUTE, minutes);
        cal.set(Calendar.SECOND, seconds);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    /**
     * 获取指定日期的小时
     * @return
     */
    public static int getCurrentHours(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.HOUR_OF_DAY);
    }
}
