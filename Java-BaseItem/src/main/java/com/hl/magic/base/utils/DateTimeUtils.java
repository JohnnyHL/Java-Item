package com.hl.magic.base.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 日期格式转换工具类
 *
 * @author hl
 * @date 2020/9/18 9:08
 */
public class DateTimeUtils {

    /***
     * 将Java的CST格式的时间字符串转为Date对象和所需日期格式：年月日时分秒
     *
     * @param cstTime Java的CST格式时间字符串
     * @return 2020-09-17 11:30:30
     */
    public static String paraseCstTimeToDateTime(String cstTime) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyy", Locale.US);
        try {
            Date date = dateFormat.parse(cstTime);
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将Java的CST格式的时间字符串转为Date对象和所需日期格式：年月日
     *
     * @param cstTime Java的CST格式时间字符串
     * @return 2020-09-17
     */
    public static String paraseCstTimeToDate(String cstTime) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyy", Locale.US);
        try {
            Date date = dateFormat.parse(cstTime);
            return new SimpleDateFormat("yyyy-MM-dd").format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getNow(){
        LocalDateTime now = LocalDateTime.now();
        return now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }


    //口令弱性检测
    public static boolean checkPwd(String password){
        //[a-zA-Z0-9]{8}
        Pattern p = Pattern.compile("^(?![0-9]+$)(?![a-zA-Z]+$)[a-zA-Z0-9]{8}$");
        Matcher mm = p.matcher(password);
        boolean b = mm.matches();
        return b;
    }
}