package base.javaapi.datedemo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期测试类
 *
 *【1】Calender类：日历类
 *	该类将所有可能用到的事件信息封装为静态成员变量，便于获取。
 *	calender为抽象类， 在创建对象时，通过静态方法创建，将语言内容处理好，返回子类对象。
 *	MONTH月，从0开始算起,最大11,0表示1月,11表示12月。
 *
 *【2】静态方法
 *	getInstance()返回子类对象
 *	Calender c = new Calender();	//返回当前时间
 *
 *【3】Canlender类的set方法
 *	Calendar 提供了一个类方法 getInstance，以获得此类型的一个通用的对象。
 *	Calendar 的 getInstance方法返回一个 Calendar对象，其日历字段已由当前日期和时间初始化：
 *	Calendar c = Calendar.getInstance();
 *
 *	方式1：
 *	x.set(int field,int value);
 *		field:设置的日历字段
 *		value:设置后具体的数值
 *
 *	方式2：
 *	x.set(int year,int month,int day);
 *		传递3个整数的年、月、 日
 *
 *【4】Canlender类中的add方法
 *	日历的偏移量，可以指定一个日历中的字段，让其进行整数的偏移
 *
 *【5】Calender类的getTime()方法
 *	把日历对象，转换成Date日期对象
 *
 * @author hl
 */
public class CalenderTest {

    private static final Logger logger = LoggerFactory.getLogger(CalenderTest.class);

    /*
     * Canlender类的get方法
     * 获取日历字段的值，年月日时分秒
     * int get(int a),参数a获取哪个日历的字段
     * 返回值，表示日历字段的具体数值
     */

    /**
     * 1.get方法，获取年份、月份、天数
     */
    @Test
    public void testDateFormatGet_OK() {
        Calendar c = Calendar.getInstance();
        //获取年份
        int year = c.get(Calendar.YEAR);
        //获取月份
        int month = c.get(Calendar.MONTH) + 1;
        //获取天数(月中的天数)
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日");
    }

    /**
     * 2.set()方法，设置年月日时间段
     */
    @Test
    public void testDateFormatSet_OK() {
        Calendar c2 = Calendar.getInstance();
        //方式1：设置月份，设置到10月
        c2.set(Calendar.MONTH, 9);

        //方式2：设置年、月、日数值
        c2.set(2099, 5, 1);

        //获取年、月、日时间字段
        int year = c2.get(Calendar.YEAR);
        //获取月份
        int month = c2.get(Calendar.MONTH) + 1;
        //获取天数(月中的天数)
        int day = c2.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日");
    }

    /**
     * 3.dd()方法，让日历中天数向后偏移若干天
     */
    @Test
    public void testDateFormatAdd_OK() {
        Calendar c3 = Calendar.getInstance();
        //让日历中的天数向后偏移若干天
        c3.add(Calendar.DAY_OF_MONTH, 0);

        //获取年、月、日时间字段
        int year = c3.get(Calendar.YEAR);
        //获取月份
        int month = c3.get(Calendar.MONTH) + 1;
        //获取天数(月中的天数)
        int day = c3.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "年" + month + "月" + day + "日");
    }

    /**
     * 4.getTime()将日历类型转为日期类型
     */
    @Test
    public void testDateFormatGetTime_OK() {
        Calendar c4 = Calendar.getInstance();
        //将日历类型转为日期类型
        Date date = c4.getTime();
        System.out.println(date);
    }

    /**
     * 5.currentTimeMillis()从时间原点到此刻的总毫秒数
     */
    @Test
    public void testGetCurrentTime_OK(){
        long currentTimeMillis = System.currentTimeMillis();
        logger.debug("从时间原点到此刻的总毫秒数:{}", currentTimeMillis);
    }

    /**
     * 6.Date()获取原点时间
     */
    @Test
    public void testGetDate_OK(){
        Date date = new Date(0);
        logger.debug("获取原点时间:{}", date);
    }

    /**
     * 7.getTime()
     */
    @Test
    public void testGetTime_OK(){
        Date date = new Date();
        long time = date.getTime();
        logger.debug("从时间原点到此刻的总毫秒数:{}", time);
    }

    /**
     * 8.解析日期格式的字符串文本，生成Date日期
     */
    @Test
    public void testPaseDateFormat_OK() throws ParseException {
        //设置日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //解析字符串文本，生成Date日期
        Date time = sdf.parse("2018-12-4");
        logger.debug("Date日期:{}", time);
    }

    /**
     * 9.设置时间/日期格式，并输出当前时间
     */
    @Test
    public void testGetDateFormat__OK(){
        //设置时间/日期格式，并输出当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(new Date());
        logger.debug("设置时间/日期格式，输出当前时间:{}", format);
    }
}
