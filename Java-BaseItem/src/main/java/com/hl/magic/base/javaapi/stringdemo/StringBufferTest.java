package base.javaapi.stringdemo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Administrator
 *StringBuffer
 *【1】字符串缓冲区
 *StringBuffer：可变字符序列
 *	提高原有字符串的操作效率，类似于一个String的字符缓冲区，字符串缓冲区支持可变字符串
 *	即它是一个容器，容器中装很多字符串，并且能够对其中的字符串进行操作。
 *
 *	内部采用可变数组方式实现，类内部定义了没有final的数组
 *	char[] 默认16个字符
 *
 *方法：
 *	append()：将任意类型的数据，添加至字符串的缓冲区中
 *			调用者是谁，返回值就是谁
 *	delete(int start,int end):删除缓冲区的字符
 *			包含开始索引，不包含结尾索引
 *	deleteCharAt(int index);	//删除指定索引位上的字符
 *	insert(int a, "A"):将任意类型的数据插入指定索引位置前边
 *	replace(int start, int end, "A");//将一定索引区间字符替换为A，包含索引头，不含索引尾
 *	reverse()	:将缓冲区间反转
 *上述方法调用后，返回的都是当前对象自己。
 *
 *	//String string();继承Object,重写toString();
 *	toString():将缓冲区的所有字符，变成字符串	//将一个可变的字符串缓冲区对象变成了一个不可变的String对象
 *	setCharAt()
 *	setLength()
 */
public class StringBufferTest {

    private static final Logger logger = LoggerFactory.getLogger(StringBufferTest.class);

    /**
     * append方法测试：将任意类型的数据，添加至字符串的缓冲区中
     * 调用者是谁，返回值就是谁
     */
    @Test
    public void testAppend_OK() {
        StringBuffer str = new StringBuffer();
        //调用append()方法，向缓冲区追加内容
        //方法调用链
        str.append(123).append(false).append(1.5);
        logger.debug("append方法测试：{}", str);
    }

    /**
     * delete方法测试
     */
    @Test
    public void testDelete_OK() {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("0123456789");
        logger.debug("append方法--测试：{}", stringBuffer);

        //删除缓冲区索引1到索引4之间的字符，包含1索引，不包含4索引
        stringBuffer.delete(1, 4);
        logger.debug("delete方法--删除缓冲区索引1到索引4之间的字符：{}", stringBuffer);

        //删除整个缓冲区
        stringBuffer.delete(0, stringBuffer.length());
        logger.debug("delete方法--删除整个缓冲区：{}", stringBuffer);

        //删除指定索引位的字符
        stringBuffer.append("0123456789");
        stringBuffer.deleteCharAt(5);
        logger.debug("delete方法--删除指定索引位的字符：{}", stringBuffer);

    }

    /**
     * insert，将任意类型的数据插入指定索引位置前边
     */
    @Test
    public void testInsert_OK() {
        String target = "0123456789";

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(target);

        stringBuffer.insert(2, "//");
        logger.debug("insert--插入方法：{}", stringBuffer);
    }

    /**
     * replace，将指定索引区间字符替换，包含索引头，不含索引尾
     */
    @Test
    public void testReplace_OK() {
        StringBuffer str1 = new StringBuffer();
        str1.append("0123456789");
        str1.replace(1, 4, "A");//将一定索引区间字符替换为A，包含索引头，不含索引尾
        logger.debug("字符串替换：{}", str1);
    }

    /**
     * revert，字符串反正
     */
    @Test
    public void testRevert_OK() {
        StringBuffer str1 = new StringBuffer();
        str1.append("0123456789");
        str1.reverse();
        logger.debug("字符串反正：{}", str1);
    }

    @Test
    public void test(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("0123456789");

        //将StringBuilder类型转换为String类型
		String s = stringBuffer.toString();

        logger.debug("类型转换：{}", s);
    }
}

