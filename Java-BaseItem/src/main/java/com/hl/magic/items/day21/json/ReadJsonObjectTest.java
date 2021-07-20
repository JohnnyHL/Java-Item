package com.hl.magic.items.day21.json;

import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * 从文件中读取JSONO格式数据文件
 *
 * @author hl
 * @date 2020/1/7
 */
public class ReadJsonObjectTest {

    private static final String JSON_FILE_PATH ="./files/data.json";

    private static final List<String> info = new ArrayList<>();

    @Before
    public void loadIpListFromFile(){
        URL resource = ReadJsonObjectTest.class.getResource(JSON_FILE_PATH);
        String file = resource.getFile();
        //载入JSON文件
        File files = new File(file);
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(files));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                info.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void readFile(){
        if (null == info) {
            loadIpListFromFile();
        }
        System.out.println("============>"+ info);
    }
}
