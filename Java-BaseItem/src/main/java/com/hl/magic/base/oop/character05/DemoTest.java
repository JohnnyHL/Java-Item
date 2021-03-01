package com.hl.magic.base.oop.character05;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author hl
 * @date 2020/9/17 14:47
 */
public class DemoTest {

    @Test
    public void test_case1(){
        String dateStr = "Thu Sep 17 15:04:52 CST 2020";
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyy", Locale.CANADA);

        try {
            Date date = dateFormat.parse(dateStr);
            String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
            System.out.println("==========>" + format);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
