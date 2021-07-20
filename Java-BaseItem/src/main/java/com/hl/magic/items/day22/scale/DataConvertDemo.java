package com.hl.magic.items.day22.scale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 进制转换
 * 核心：余数定理
 * @author hl
 * @date 2021/2/25 10:47
 */
public class DataConvertDemo {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataConvertDemo.class);

    /**
     * 10进制数转为2进制数
     * [1]整数部分：除2取余法，从最后一位倒序
     * [2]小数部分：乘2取整法，从第一位顺序
     *
     * @param inData 10进制数
     * @return 2进制数
     */
    public static void cha_2(int inData){
        if(inData >= 2){
            cha_2(inData / 2);
        }
        System.out.print(inData % 2);
    }

    /**
     * 10进制数转为16进制数
     * @param inData 10进制数
     * @return 16进制数
     */
    public static void cha_16(int inData){
        if(inData >= 16){
            cha_16(inData /16);
        }
        if(inData % 16 < 10){
            System.out.print(inData % 16);
        } else{
            System.out.print((char)(inData % 16 + 55));
        }
    }


    public static void main(String[] args) {
        LOGGER.debug("cas1结果：{}");

        int a = 27,b=37,c=47;
        System.out.print("10进制数"+ a + "==>2进制输出：" );
        cha_2(a);
        System.out.println();

        System.out.print("10进制数"+ b + "==>16进制输出：" );
        cha_16(b);

    }
}
