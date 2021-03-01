package com.hl.magic.base.io.demo01.filewriter;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流写文本FileWriter类
 *	父类：java.io.Writer所有字符数出流的超类
 *
 *[1]局限性
 *	只能用于写文本文件
 *
 *[2]方法摘要
 *	write(int c);写一个字符
 *	write(char[] cbuf);写入一个字符数组。
 *	write(char[] cbuf, int off, int len);写入字符数组的一部分，从索引off处开始，写入len长度的字符。
 *	write(String str);写一个字符串
 *	flush()刷新流
 *
 *[3]子类对象
 *	FileWriter
 *		构造方法：写入的数据目的
 *		参数：File类型对象
 *			String 文件名
 *	字符输出流写数据的时候，必须运行flush();刷新流
 *
 *[4]写入字符的流向
 *	自定义程序生成字符，通过字符输出流写文本FileWriter类，最终将字符写入到目标文件中
 *	code程序------->输出字符----->放入字符输出流中，调用写字符方法------->写进目标文件
 *
 * @author hl
 */
public class WriterTest {

    @Test
    public static void run1() throws IOException{
        FileWriter fWriter = new FileWriter("e:\\学习资料\\javatest\\LOOK\\writer.txt");

        //写入字符
        fWriter.write(122);
        fWriter.flush();

        //写入字符数组
        char[] ch = {'A','B','C','D','E','-'};
        fWriter.write(ch);
        fWriter.flush();

        //写入一部分字符数组
        fWriter.write(ch, 1, 2);
        fWriter.flush();

        //写入字符串
        fWriter.write("-abc，你好");
        fWriter.flush();
        fWriter.close();
    }
}