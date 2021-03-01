package base.keywords;

import com.hl.magic.base.utils.DateTimeUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.util.Date;
import java.util.Map;
import java.util.Properties;

/**
 * @author hl
 * @date 2020/10/26 14:16
 */
public class StringBaseTwoTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(StringBaseTwoTest.class);

    @Test
    public void systemInfoTest(){
        String date = new Date().toString();
        LOGGER.debug("=====>{}", date);

        long time = System.nanoTime();
        LOGGER.debug("=====>{}", time);

        Properties properties = System.getProperties();
        LOGGER.debug("=====>{}", properties);

        String osEnv = System.getProperty("os.name").toLowerCase();
        LOGGER.debug("=====>{}", osEnv);

        String case1 = System.getProperty("java.version").toLowerCase();
        LOGGER.debug("=====>{}", case1);

        Map<String, String> getenv = System.getenv();
        LOGGER.debug("=====>{}", getenv);
    }

    @Test
    public void dateTimeTest(){
        String now = DateTimeUtils.getNow();
        LOGGER.debug("=====>{}", now);
    }

    @Test
    public void case11(){
        String pwd1 = "11111111";
        String pwd2 = "a1111111";
        String pwd3 = "A1111111";
        String pwd4 = "Aa111111";
        boolean b = DateTimeUtils.checkPwd(pwd2);
        LOGGER.debug("=====>{}", b);
        if (!b) {
            JOptionPane.showMessageDialog(null, "新口令须为数字+字母组合，长度为8的字符串");
        }
    }
}
