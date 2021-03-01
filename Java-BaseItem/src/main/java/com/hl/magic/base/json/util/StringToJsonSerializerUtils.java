package com.hl.magic.base.json.util;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * 序列化时将字符串转为json格式
 *
 * @author hl
 * @date 2020/3/12
 */
public class StringToJsonSerializerUtils implements ObjectSerializer {

    @Override
    public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features) throws IOException {
        serializer.write(JSONObject.parseObject(object.toString()));
    }
}
