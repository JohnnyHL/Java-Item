package base.javaapi.stringdemo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * String测试
 * String类的特点
 * 1.字符串是常量，一旦创建将不可更改。
 * 2.字符串的本质，即字符数组
 *
 * @author hl
 * @date 2020/5/7 10:06
 */
public class StringBaseTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringBaseTest.class);

    /**
     * 测试1：根据目标字符对字符串切割
     */
    @Test
    public void test_Split() {
        String target = "192.168.6.123|6666|3";

        String[] split = target.split("\\|");
        LOGGER.debug("ip is {}", split[0].trim());
        LOGGER.debug("port is {}", split[1].trim());
        LOGGER.debug("type is {}", split[2].trim());

        String randomValue = UUID.randomUUID().toString();
        LOGGER.info("UUID随机数：{}", randomValue);

        String[] split2 = randomValue.split("-");
        for (int i = 0; i < split2.length; i++) {
            String value = split2[i];
            LOGGER.info("切割UUID随机数：{}", value);
        }
    }

    /**
     * 测试2：字符串分隔
     * 对比测试1：2的分隔效果不好，目标字符串变动时，分隔将会抛异常。
     */
    @Test
    public void test_SubString() {
        String target = "192.168.6.123|6666|3";

        String substring1 = target.substring(0, target.lastIndexOf("|") - 5);
        String substring2 = target.substring(substring1.length() + 1, target.lastIndexOf("|"));
        String substring3 = target.substring((substring2 + substring1).length() + 2, target.lastIndexOf("|") + 2);

        LOGGER.debug("IP地址：{}", substring1);
        LOGGER.debug("port：{}", substring2);
        LOGGER.debug("type：{}", substring3);
    }

    @Test
    public void test_All() {
        String s1 = "abcdefgh";
        String s2 = "123";
        LOGGER.debug("字符串的连接：" + s1.concat(s2));
        LOGGER.debug("字符串的长度：" + s1.length());
        LOGGER.debug("字符串某一位置上的字符：" + s1.charAt(2));
        LOGGER.debug("字符串比较：" + s1.equals(s2));
        //截取3索引以后的子串(包含索引3上的字符串)
        LOGGER.debug("从字符串中提取子串：" + s1.substring(3));
        //截取1索引到3索引之间的子串，不包含3索引位
        LOGGER.debug("从字符串中截取部分子串：" + s1.substring(1, 3));

        //输出所查字符的索引下标
        LOGGER.debug("字符串中单个字符的查找：" + s1.indexOf('c'));
        String s3 = "   ab cd ef gh ";
        LOGGER.debug("去掉字符串头/尾部多余的空格" + s3.trim());
    }

    @Test
    public void test_contains() {
        String randomValue = UUID.randomUUID().toString().replace("-", "");
        boolean contains = randomValue.contains("-");
        LOGGER.info("包含某个字符：{}", contains);
    }

    @Test
    public void test_charAt() {
        String randomVlue = UUID.randomUUID().toString();
        LOGGER.info("UUID随机数：{}", randomVlue);
        char cc = randomVlue.charAt(0);
        LOGGER.info("返回指定索引处的char值：{}", cc);
    }

    @Test
    public void test_concat() {
        String value1 = "ABCD";
        String value2 = "1234";
        String concat = value1.concat(value2);
        LOGGER.info("将指定字符串连接到此字符串的结尾:{}", concat);
    }

    @Test
    public void test_startWith() {
        String value1 = "81091f2a-1e9b-42ac-a9b0-504eba10d61d.exe";
        boolean startsWith1 = value1.startsWith(".e");
        LOGGER.info("字符串是否以指定的后缀开始:{}", startsWith1);

        boolean startsWith2 = value1.startsWith(".exe");
        LOGGER.info("字符串是否以指定的后缀开始:{}", startsWith2);
    }

    @Test
    public void test_endsWith() {
        String value1 = "ABCD.exe";
        boolean endsWith1 = value1.endsWith(".e");
        LOGGER.info("字符串是否以指定的后缀结束:{}", endsWith1);

        boolean endsWith2 = value1.endsWith(".exe");
        LOGGER.info("字符串是否以指定的后缀结束:{}", endsWith2);
    }

    /**
     * int indexOf(String value)：返回指定子字符串在此字符串中第一次出现处的索引。
     * <p>
     * 如果字符串参数作为一个子字符串在此对象中出现，则返回第一个这种子字符串的第一个字符的索引；
     * 如果它不作为一个子字符串出现，则返回 -1。
     */
    @Test
    public void test_indexOf() {
        String random = UUID.randomUUID().toString();
        LOGGER.info("随机字符串:{}", random);

        int value = random.indexOf("a");
        LOGGER.info("返回指定字符串在此字符串中第一次出现的位置:{}", value);
    }

    @Test
    public void test_lastIndexOf() {
        String random = UUID.randomUUID().toString();
        LOGGER.info("随机字符串内容：{}", random);

        int index = random.lastIndexOf("a");
        LOGGER.info("返回指定字符在此字符串中最后一次出现处的索引:{}", index);
    }

    @Test
    public void test_isEmpty() {
        String random = UUID.randomUUID().toString();
        boolean empty = random.isEmpty();
        LOGGER.info("该字符串是否为空字符串：{}", empty);
    }

    @Test
    public void test_length() {
        String random = UUID.randomUUID().toString();
        LOGGER.info("随机字符串的内容：{}", random);
        LOGGER.info("字符串的长度：{}", random.length());

        String value2 = random.replaceAll("-", "");
        LOGGER.info("新字符串的长度：{}", value2.length());
    }

    @Test
    public void test_trim() {
        String str = " e979236b      ";
        String value = str.trim();
        LOGGER.info("返回字符串的副本，忽略字符串的首和尾部的空格：{}", value);
    }

    @Test
    public void test_valueOf() {
        int a = 123456;
        String value = String.valueOf(a);
        LOGGER.info("返回 int 参数的字符串表示形式:{}", value);
    }

    @Test
    public void test_fun() {
        String random = UUID.randomUUID().toString();
        LOGGER.info("随机字符串:{}, 字符串长度：{}", random,random.length());

        int indexOf = random.indexOf("-");
        LOGGER.info("特殊字符-第一次出现的索引位置:{}", indexOf);

        int lastIndexOf = random.lastIndexOf("-");
        LOGGER.info("特殊字符-最后一次次出现的索引位置:{}", lastIndexOf);
    }
}