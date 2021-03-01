package com.hl.magic.base.io.demo01.filewriter;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

/**
 * 字符输入流读取文本文件FileReader类
 * 	java.io.Reader所有字符输入流的超类
 *	[1]功能局限性
 * 		只能读取文本文件，可以读取包含中文的文件
 *
 * 	[2]构造方法
 * 		FileReader(File file)
 * 		FileReader(String fileName)
 *
 *	[3]方法摘要
 * 		close() 关闭流并释放与之相关联的任何系统资源。
 *  	void mark(int readAheadLimit) 标记流中的当前位置。
 *  	boolean markSupported() 告诉这个流是否支持mark()操作。
 *   	int read() 读一个字符
 *   	int read(char[] ch)将字符读入数组。
 *  	abstract int read(char[] ch, int off, int len) 将字符读入数组的一部分。
 *   	int read(CharBuffer target) 尝试将字符读入指定的字符缓冲区。
 *  	boolean ready() 告诉这个流是否准备好被读取。
 *   	void reset() 重置流。
 * 		long skip(long n) 跳过字符
 *
 * 	[4]写入字符的流向
 *	通过字符输入流去读源数据文件，最终将读取到的字符打印出来
 *	源数据文件------>放入字符输出流中，调用写字符方法------->console打印读取到的字符
 *
 * @author hl
 */
public class ReaderTest {

    private static final String FILE_PATH = "E:\\Study\\Test\\file\\11111.txt";

    /**
     * 字符输入流读取文本文件FileReader类
     * 将字符读入字符数组中
     */
    @Test
    public void testReadChar_OK() throws IOException{
        FileReader reader = new FileReader(FILE_PATH);
        int len;
        //循环去读文件内容，读到最后一个字符时输出-1，表示读取完毕
        while ((len = reader.read()) != -1) {
            System.out.print((char)len);
        }
        reader.close();
    }

    /**
     * 字符输入流读取文本文件FileReader类
     * 将字符读入字符数组中
     */
    @Test
    public void testReadByte_OK() throws IOException{
        FileReader reader = new FileReader(FILE_PATH);
        int len;
        //字符数组
        char[] ch = new char[1024];
        //循环地将字符读入字符数组中
        while ((len = reader.read(ch)) != -1) {
            System.out.print(new String(ch,0,len));
        }
        reader.close();
    }
}