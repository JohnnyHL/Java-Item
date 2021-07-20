package com.hl.magic.items.day05.classes;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * String测试
 *
 * @author hl
 * @date 2020/5/7 10:06
 */
public class StringBaseTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringBaseTest.class);

    @Test
    public void splitTest() {
        String randomValue = UUID.randomUUID().toString();
        LOGGER.info("UUID随机数：{}", randomValue);

        String[] split = randomValue.split("-");
        for (int i = 0; i < split.length; i++) {
            String value = split[i];
            LOGGER.info("切割UUID随机数：{}", value);
        }
    }

    @Test
    public void containsTest() {
        String randomValue = UUID.randomUUID().toString().replace("-", "");
        boolean contains = randomValue.contains("-");
        LOGGER.info("包含某个字符：{}", contains);
    }

    @Test
    public void charAtTest() {
        String randomVlue = UUID.randomUUID().toString();
        LOGGER.info("UUID随机数：{}", randomVlue);
        char cc = randomVlue.charAt(0);
        LOGGER.info("返回指定索引处的char值：{}", cc);
    }

    @Test
    public void concatTest() {
        String value1 = "ABCD";
        String value2 = "1234";
        String concat = value1.concat(value2);
        LOGGER.info("将指定字符串连接到此字符串的结尾:{}", concat);
    }

    @Test
    public void startWithTest() {
        String value1 = UUID.randomUUID().toString() + ".exe";
        boolean startsWith1 = value1.startsWith(".e");
        LOGGER.info("字符串是否以指定的后缀开始:{}", startsWith1);

        boolean startsWith2 = value1.startsWith(".exe");
        LOGGER.info("字符串是否以指定的后缀开始:{}", startsWith2);
    }

    @Test
    public void endsWithTest() {
        String value = UUID.randomUUID().toString() + ".exe";
        boolean endsWith1 = value.endsWith(".e");
        LOGGER.info("字符串是否以指定的后缀结束:{}", endsWith1);

        boolean endsWith2 = value.endsWith(".exe");
        LOGGER.info("字符串是否以指定的后缀结束:{}", endsWith2);
    }

    /**
     * int indexOf(String value)：返回指定子字符串在此字符串中第一次出现处的索引。
     *
     * 如果字符串参数作为一个子字符串在此对象中出现，则返回第一个这种子字符串的第一个字符的索引；
     * 如果它不作为一个子字符串出现，则返回 -1。
     */
    @Test
    public void indexOfTest() {
        String random = UUID.randomUUID().toString();
        LOGGER.info("随机字符串:{}", random);

        int value = random.indexOf("a");
        LOGGER.info("返回指定字符串在此字符串中第一次出现的位置:{}", value);
    }

    @Test
    public void lastIndexOfTest() {
        String random = UUID.randomUUID().toString();
        LOGGER.info("随机字符串内容：{}", random);

        int index = random.lastIndexOf("a");
        LOGGER.info("返回指定字符在此字符串中最后一次出现处的索引:{}", index);
    }

    @Test
    public void isEmptyTest() {
        String random = UUID.randomUUID().toString();
        boolean empty = random.isEmpty();
        LOGGER.info("该字符串是否为空字符串：{}", empty);
    }

    @Test
    public void lengthTest() {
        String value = UUID.randomUUID().toString();
        LOGGER.info("随机字符串的内容：{}", UUID.randomUUID().toString());
        LOGGER.info("字符串的长度：{}", value.length());

        String value2 = value.replaceAll("-", "");
        LOGGER.info("新字符串的长度：{}", value2.length());
    }

    @Test
    public void trimTest() {
        String str = " e979236b      ";
        String value = str.trim();
        LOGGER.info("返回字符串的副本，忽略字符串的首和尾部的空格：{}", value);
    }

    @Test
    public void valueOfTest() {
        int a = 123456;
        String value = String.valueOf(a);
        LOGGER.info("返回 int 参数的字符串表示形式:{}", value);
    }

    @Test
    public void mapTest(){
        Map map = new HashMap(16);
        map.put("id", "123456");
        map.put("ip", "192.168.6.246_192.168.6.248_192.168.6.11");

        System.out.println("======>" + map.get("ip"));
    }

    /**
     * 特殊字符过滤测试
     */
    @Test
    public void replaceAllTest(){
        String value1 = "\r\n\r\n      1.0.7            \r\n  -         vsm                        \r\n    * mntd                              161";
        value1 = value1.replaceAll("\\s", "");
        LOGGER.debug("=====>{}", value1);
    }

    @Test
    public void replaceTest(){
        String random = UUID.randomUUID().toString().replace("-", "");
        LOGGER.debug("=====>{}", random);
    }
}