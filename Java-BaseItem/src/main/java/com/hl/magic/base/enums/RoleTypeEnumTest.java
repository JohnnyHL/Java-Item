package com.hl.magic.base.enums;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * enum枚举测试类
 *
 * @author hl
 * @date 2020/1/8
 */
public class RoleTypeEnumTest {

    private static final Logger logger = LoggerFactory.getLogger(RoleTypeEnumTest.class);

    /**
     * 静态values()方法，返回一个包含全部枚举值的数组
     */
    @Test
    public void testGetEnumValue1_OK() {
        RoleTypeEnum[] values = RoleTypeEnum.values();
        for (int i = 0; i < values.length; i++) {
            RoleTypeEnum name = values[i];
            int code = values[i].getCode();
            String remark = values[i].getRemark();
            logger.debug("{}的角色码{}，角色类型：{}", name, code, remark);
        }
    }

    /**
     * 返回指定的枚举数组元素
     * new RoleTypeEnum[]{RoleTypeEnum.ADMIN,RoleTypeEnum.OPERATOR,RoleTypeEnum.AUDIT,RoleTypeEnum.BUSS};
     */
    @Test
    public void testGetEnumValue2_OK() {
        RoleTypeEnum[] roleTypeEnums = new RoleTypeEnum[]{RoleTypeEnum.ADMIN, RoleTypeEnum.OPERATOR, RoleTypeEnum.AUDIT, RoleTypeEnum.BUSS};
        for (int i = 0; i < roleTypeEnums.length; i++) {
            int code = roleTypeEnums[i].getCode();
            String remark = roleTypeEnums[i].getRemark();
            logger.debug("{}的角色码{}，角色类型：{}", roleTypeEnums[i], code, remark);
        }
    }

    /**
     * valuesOf()
     */
    @Test
    public void testGetEnumValue3_OK() {
        RoleTypeEnum admin = RoleTypeEnum.valueOf(RoleTypeEnum.ADMIN.toString());
        int code = admin.getCode();
        String remark = admin.getRemark();
        logger.debug("角色码{}，角色类型：{}", code, remark);
    }
}
