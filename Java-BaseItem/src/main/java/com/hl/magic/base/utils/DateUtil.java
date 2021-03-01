package com.hl.magic.base.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/***
 * 日期格式工具类
 */
public class DateUtil {

    /**
     * 缺省的日期格式
     */
    private static final String DEFAULT_DATE_FORMAT = "yyyy-M-d";

    /**
     * 默认显示日期的格式
     */
    public static final String DATE_FORMAT_STR = "yyyy-MM-dd";

    /**
     * 默认显示日期的格式
     */
    public static final String YYYY_MM_DATE_FORMAT_STR = "yyyy-MM";

    /**
     * 默认显示日期时间的格式
     */
    public static final String DATE_TIMEF_STR = "yyyy-MM-dd HH:mm:ss";

    /**
     * 日期格式字符串
     */
    public static final String DATE_TIMEF_STR2 = "yyyyMMddHHmmss";

    /**
     * 默认显示简体中文日期的格式
     */
    public static final String ZHCN_DATE_FORMAT_STR = "yyyy年MM月dd日";

    /**
     * 默认显示简体中文日期时间的格式
     */
    public static final String ZHCN_DATE_TIMEF_STR = "yyyy年MM月dd日HH时mm分ss秒";

    /**
     * 默认显示简体中文日期时间的格式
     */
    public static final String ZHCN_DATE_TIMEF_STR_4yMMddHHmm = "yyyy年MM月dd日HH时mm分";

    /**
     * 默认日期类型格试
     */
    private static SimpleDateFormat dateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT);

    /**
     * 缺省的日期时间格式
     */
    private static final String DEFAULT_DATETIME_FORMAT = "yyyy-M-d HH:mm:ss";

    /**
     * 时间格式
     */
    private static String DATE_TIME_FORMAT = DEFAULT_DATETIME_FORMAT;

    private static SimpleDateFormat dateTimeFormat = new SimpleDateFormat(DATE_TIME_FORMAT);

    /**
     * 缺省的时间格式
     */
    private static final String DEFAULT_TIME_FORMAT = "HH:mm:ss";

    /**
     * 时间格式
     */
    private static String TIME_FORMAT = DEFAULT_TIME_FORMAT;

    private static SimpleDateFormat timeFormat = new SimpleDateFormat(TIME_FORMAT);

    private DateUtil() {
        // 私用构造主法.因为此类是工具类.
    }

    /**
     * 将日期转为yyyyMMddHHmmss格式
     *
     * @param dateTime 格式： yyyy-MM-dd HH:mm:ss
     * @return 输出 yyyyMMddHHmmss
     */
    public static String getDateTimefStr(String dateTime) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_TIMEF_STR);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(DATE_TIMEF_STR2);
        String format = null;
        try {
            Date parse = simpleDateFormat.parse(dateTime);
            format = simpleDateFormat1.format(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return format;
    }

    /**
     * 将日期转为整型
     *
     * @param dateTime 格式： yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static long getSimpleDateTime(String dateTime) {
        long time = 0;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_TIMEF_STR);
        try {
            time = simpleDateFormat.parse(dateTime).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }

    /**
     * 获取格式化实例.
     *
     * @param pattern 如果为空使用DEFAULT_DATE_FORMAT
     * @return
     */
    public static SimpleDateFormat getFormatInstance(String pattern) {
        if (pattern == null || pattern.length() == 0) {
            pattern = DEFAULT_DATE_FORMAT;
        }
        return new SimpleDateFormat(pattern);
    }

    /**
     * 格式化Calendar
     *
     * @param calendar
     * @return
     */
    public static String formatCalendar(Calendar calendar) {
        if (calendar == null) {
            return "";
        }
        return dateFormat.format(calendar.getTime());
    }

    public static String formatDateTime(Date d) {
        if (d == null) {
            return "";
        }
        return dateTimeFormat.format(d);
    }

    public static String formatDate(Date d) {
        if (d == null) {
            return "";
        }
        return dateFormat.format(d);
    }

    /**
     * 格式化时间
     *
     * @return
     */
    public static String formatTime(Date d) {
        if (d == null) {
            return "";
        }
        return timeFormat.format(d);
    }

    /**
     * 格式化整数型日期
     *
     * @param intDate
     * @return
     */
    public static String formatIntDate(Integer intDate) {
        if (intDate == null) {
            return "";
        }
        Calendar c = newCalendar(intDate);
        return formatCalendar(c);
    }

    /**
     * 根据指定格式化来格式日期.
     *
     * @param date    待格式化的日期.
     * @param pattern 格式化样式或分格,如yyMMddHHmmss
     * @return 字符串型日期.
     */
    public static String formatDate(Date date, String pattern) {
        if (date == null) {
            return "";
        }
        if (null == pattern || "".equals(pattern)) {
            return formatDate(date);
        }
        SimpleDateFormat simpleDateFormat = null;
        try {
            simpleDateFormat = new SimpleDateFormat(pattern);
        } catch (Exception e) {
            e.printStackTrace();
            return formatDate(date);
        }
        return simpleDateFormat.format(date);
    }

    /**
     * 取得Integer型的当前日期
     *
     * @return
     */
    public static Integer getIntNow() {
        return getIntDate(getNow());
    }

    /**
     * 取得Integer型的当前日期
     *
     * @return
     */
    public static Integer getIntToday() {
        return getIntDate(getNow());
    }

    /**
     * 取得Integer型的当前年份
     *
     * @return
     */
    public static Integer getIntYearNow() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        return year;
    }

    /**
     * 取得Integer型的当前月份
     *
     * @return
     */
    public static Integer getIntMonthNow() {
        Calendar c = Calendar.getInstance();
        int month = c.get(Calendar.MONTH) + 1;
        return month;
    }

    public static String getStringToday() {
        return getIntDate(getNow()) + "";
    }

    /**
     * 根据年月日获取整型日期
     *
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static Integer getIntDate(int year, int month, int day) {
        return getIntDate(newCalendar(year, month, day));
    }

    /**
     * 某年月的第一天
     *
     * @param year
     * @param month
     * @return
     */
    public static Integer getFirstDayOfMonth(int year, int month) {
        return getIntDate(newCalendar(year, month, 1));
    }

    /**
     * 某年月的第一天
     *
     * @return
     */
    public static Integer getFirstDayOfThisMonth() {
        Integer year = DateUtil.getIntYearNow();
        Integer month = DateUtil.getIntMonthNow();
        return getIntDate(newCalendar(year, month, 1));
    }

    /**
     * 某年月的第一天
     *
     * @param date
     * @return
     * @time:2008-7-4 上午09:58:55
     */
    public static Integer getFistDayOfMonth(Date date) {
        Integer intDate = getIntDate(date);
        int year = intDate / 10000;
        int month = intDate % 10000 / 100;
        return getIntDate(newCalendar(year, month, 1));
    }

    /**
     * 某年月的最后一天
     *
     * @param year
     * @param month
     * @return
     */
    public static Integer getLastDayOfMonth(int year, int month) {
        return intDateSub(getIntDate(newCalendar(year, month + 1, 1)), 1);
    }

    /**
     * 根据Calendar获取整型年份
     *
     * @param c
     * @return
     */
    public static Integer getIntYear(Calendar c) {
        int year = c.get(Calendar.YEAR);
        return year;
    }

    /**
     * 根据Calendar获取整型日期
     *
     * @param c
     * @return
     */
    public static Integer getIntDate(Calendar c) {
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DAY_OF_MONTH);
        return year * 10000 + month * 100 + day;
    }

    /**
     * 根据Date获取整型年份
     *
     * @param d
     * @return
     */
    public static Integer getIntYear(Date d) {
        if (d == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        return getIntYear(c);
    }

    /**
     * 根据Date获取整型日期
     *
     * @param d
     * @return
     */
    public static Integer getIntDate(Date d) {
        if (d == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        return getIntDate(c);
    }

    /**
     * 根据Integer获取Date日期
     *
     * @param n
     * @return
     */
    public static Date getDate(Integer n) {
        if (n == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
        c.set(n / 10000, n / 100 % 100 - 1, n % 100);
        return c.getTime();
    }

    public static Date getDate(String date) {
        if (date == null || date.length() == 0) {
            return null;
        }

        try {
            if (date.contains("/")) {
                date = date.replaceAll("/", "-");
            }
            return getFormatInstance(DATE_FORMAT_STR).parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 根据年份Integer获取Date日期
     *
     * @param year
     * @return
     */
    public static Date getFirstDayOfYear(Integer year) {
        if (year == null) {
            return null;
        }
        Calendar c = Calendar.getInstance();
        c.set(year, 1, 1);
        return c.getTime();
    }

    /**
     * 根据年月日生成Calendar
     *
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static Calendar newCalendar(int year, int month, int day) {
        Calendar ret = Calendar.getInstance();
        if (year < 100) {
            year = 2000 + year;
        }
        ret.set(year, month - 1, day);
        return ret;
    }

    /**
     * 根据整型日期生成Calendar
     *
     * @param date
     * @return
     */
    public static Calendar newCalendar(int date) {
        int year = date / 10000;
        int month = (date % 10000) / 100;
        int day = date % 100;

        Calendar ret = Calendar.getInstance();
        ret.set(year, month - 1, day);
        return ret;
    }

    /**
     * 取得Date型的当前日期
     *
     * @return
     */
    public static Date getNow() {
        return new Date();
    }

    /**
     * 取得Date型的当前日期
     *
     * @return
     */
    public static Date getToday() {
        return DateUtil.getDate(DateUtil.getIntToday());
    }

    /**
     * 整数型日期的加法
     *
     * @param date
     * @param days
     * @return
     */
    public static Integer intDateAdd(int date, int days) {
        int year = date / 10000;
        int month = (date % 10000) / 100;
        int day = date % 100;

        day += days;

        return getIntDate(year, month, day);
    }

    /**
     * 整数型日期的减法
     *
     * @param date
     * @param days
     * @return
     */
    public static Integer intDateSub(int date, int days) {
        return intDateAdd(date, -days);
    }

    /**
     * 计算两个整型日期之间的天数
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static Integer daysBetweenDate(Integer startDate, Integer endDate) {
        if (startDate == null || endDate == null) {
            return null;
        }
        Calendar c1 = newCalendar(startDate);
        Calendar c2 = newCalendar(endDate);

        Long lg = (c2.getTimeInMillis() - c1.getTimeInMillis()) / 1000 / 60 / 60 / 24;
        return lg.intValue();
    }

    /**
     * 计算两个整型日期之间的天数
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static Integer daysBetweenDate(Date startDate, Date endDate) {
        if (startDate == null || endDate == null) {
            return null;
        }
        Long interval = endDate.getTime() - startDate.getTime();
        interval = interval / (24 * 60 * 60 * 1000);
        return interval.intValue();
    }

    /**
     * 取得当前日期.
     *
     * @return 当前日期, 字符串类型.
     */
    public static String getStringDate() {
        return getStringDate(DateUtil.getNow());
    }

    /**
     * 根据calendar产生字符串型日期
     *
     * @param d
     * @return eg:20080707
     */
    public static String getStringDate(Date d) {
        if (d == null) {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(d);
    }

    public static String getFormatStringDate(Date d) {
        if (d == null) {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        return sdf.format(d);
    }

    public static String getNowStr() {
        Date date = new Date();
        return DateUtil.formatDate(date, DateUtil.DATE_TIMEF_STR);
    }

    /**
     * 时间字符串转换成Date类型
     *
     * @param dateStr
     * @param format
     * @return
     */
    public static Date dateStrToDate(String dateStr, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    //2020-03-03T10:40:46.871190438+08:00
    public static Date utcStr2Date(String dateStr) {
        Date date = null;
        try {
            if (dateStr.contains("+")) {
                dateStr = dateStr.substring(0, dateStr.indexOf("+"));
            }
            if (dateStr.contains("T")) {
                dateStr = dateStr.replaceAll("T", " ");
            }
            if (dateStr.contains(".")) {
                dateStr = dateStr.substring(0, dateStr.indexOf("."));
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            date = sdf.parse(dateStr);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return date;
    }

    public static synchronized String timeId() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return formatDate(new Date(), "yyyyMMddHHmmss");
    }


    public static void main(String[] args) throws InterruptedException {
        Date date = getNow();
        String date1 = getFormatStringDate(date);
        Integer intNow = getIntNow();

        System.out.println(intNow);


    }
}

