package com.hl.magic.items.day21.json;

import com.alibaba.fastjson.JSONObject;
import com.hl.magic.items.day21.json.bean.Person;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * JSON数据封装测试类
 *
 * @author hl
 * @date 2020/1/7
 */
public class JsonObjectTest {

    private static final Logger logger = LoggerFactory.getLogger(JsonObjectTest.class);

    /**
     * [1]原始拼装JSON数据格式
     * JSONObject实例化变量，调用put方法时，其value不能为null 但是可以放入一个空对象
     */
    @Test
    public void testJson_OK() {
        JSONObject keyMan = new JSONObject();
        JSONObject json = new JSONObject();
        Object nullObject = null;
        json.put("name", "小明");
        json.put("age", 25.2);
        json.put("birthday", "1990-01-12");
        json.put("car", nullObject);
        json.put("house", nullObject);
        json.put("major", new String[]{"理发", "挖掘机炒菜"});
        json.put("comment", "原始方式拼装JSON格式数据");
        json.put("status", 0);

        keyMan.put("keyMan", json);
        logger.debug("JSONObject对象方式封装：{}", keyMan.toString());
    }

    /**
     * [2]map集合的方式拼装出JSON数据
     * 以key=value的形式存入数据
     */
    @Test
    public void testMap_OK() {
        Map<String, Object> key = new HashMap<>(16);
        Map<String, Object> map = new HashMap<>(16);
        key.put("keyman", map);
        map.put("name", "小明");
        map.put("age", 25.2);
        map.put("birthday", "小明");
        map.put("car", null);
        map.put("house", null);
        map.put("major", new String[]{"理发", "挖掘机炒菜"});
        map.put("comment", "map集合方式拼装JSON格式数据");
        map.put("status", 0);
        key.put("keyman", map);
        logger.debug("非标准JSON数据格式：{}", key.toString());
        logger.debug("标准JSON数据格式：{}", new JSONObject(map).toString());
    }

    /**
     * [3]JavaBean的方式拼装出JSON数据
     */
    @Test
    public void testCreateJsonByBean_OK() {
        Person person = new Person();
        person.setName("小明");
        person.setAge(25.2);
        person.setBirthday("1990-01-01");
        person.setSchool("新东方");
        person.setMajor(new String[] { "理发", "挖掘机炒菜" });
        person.setHas_friend(false);
        person.setHourse(null);
        person.setStatus(0);
        person.setCommont("JavaBean的方式拼装出JSON数据");
        logger.debug("非标准JSON数据格式：{}", person.toString());
        logger.debug("标准JSON数据格式：{}", JSONObject.toJSON(person));
    }
}
