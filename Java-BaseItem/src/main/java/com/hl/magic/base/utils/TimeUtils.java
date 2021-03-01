package com.hl.magic.base.utils;

import org.junit.Test;

import java.text.ParseException;

/**
 * @author hl
 * @date 2021/2/3 10:19
 */
public class TimeUtils {

    public static final String format1 = "yyyy-MM-dd HH:mm:ss";
    public static final String format2 = "yyyyMMddHHmmss";

    @Test
    public void case2() throws ParseException {
        String date1 = "2022-12-01 10:20:30";
        String dateTimefStr = DateUtil.getDateTimefStr(date1);
        System.out.println("" + dateTimefStr);
    }

    @Test
    public void case1() {
        String date1 = "2022-12-22 11:11:11";

        String date2 = "2021-12-22 11:11:11";
        long time1 = DateUtil.getSimpleDateTime(date1);
        long time2 = DateUtil.getSimpleDateTime(date2);

        System.out.println("1===>" + time1);
        System.out.println("2===>" + time2);


        long time3 = time2 - time1;
        System.out.println("3===>" + time3);
        if(time3 > 0){
            System.out.println("4===>aaaaaaaaaaaaaaaaaaaaa");
        } else {
            System.out.println("5===>bbbbbbbbbbbbbbbbbbbbb");
        }

    }
}
