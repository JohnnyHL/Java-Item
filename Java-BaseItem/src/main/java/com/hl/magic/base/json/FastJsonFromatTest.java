package com.hl.magic.base.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.hl.magic.base.json.util.StringToJsonSerializerUtils;
import org.junit.Test;

/**
 * fastjson转义字符解决方案。
 * <p>
 * 【1】替换转义字符"\""
 * <p>
 * o.replace("\"","");
 * <p>
 * 【2】JSON数据格式转换
 * JSONArray jsonObject = JSONObject.parseArray(result);
 * System.out.println("解决转义字符后：" + jsonObject);
 *
 * @author hl
 * @date 2020/3/12
 */
public class FastJsonFromatTest {

    /**
     * fastjson转义字符处理
     * 注入工具类
     */
    @JSONField(serializeUsing = StringToJsonSerializerUtils.class)
    private String jsonFromatTemplate;

    /**
     * json数据转义字符处理：转为JSONArray数组方式
     */
    @Test
    public void test_jsonFromat() {

        String result = "[{\"ip\":\"192.168.6.123\",\"port\":6666,\"version\":\"WTA-CD-HSM-LHB-V1.02.19-20200310\"}]";

        JSONArray jsonObject = JSONObject.parseArray(result);
        System.out.println("解决转义字符后：" + jsonObject);
    }

    /**
     * fastjson转义字符处理：注入工具类方式
     */
    @Test
    public void test_run() {
        String result = "[{\"ip\":\"192.168.6.123\",\"port\":6666,\"version\":\"WTA-CD-HSM-LHB-V1.02.19-20200310\"}]";

        jsonFromatTemplate = result;
        System.out.println("fastjson转义字符处理结果：" + jsonFromatTemplate);
    }

    /**
     * JSONObject对象转换
     */
    @Test
    public void test_fun() {
        String result = "[{\"ip\":\"192.168.6.123\",\"port\":6666,\"version\":\"WTA-CD-HSM-LHB-V1.02.19-20200310\"}]";

        Object json = JSONObject.toJSON(result);
        System.out.println("解决转义字符后：" + json.toString());
    }
}
