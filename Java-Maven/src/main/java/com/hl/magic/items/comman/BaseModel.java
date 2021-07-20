package com.hl.magic.items.comman;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * <p>BaseModel模型对象基础类</p>
 * 原则上一切model类均继承该类，方便做统一处理
 *
 * @author hl
 */
public class BaseModel implements Serializable {
    private static final long serialVersionUID = 2927963057417181543L;
    /**
     * 自动列出Bean的所有属性
     * @return
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
    /**
     *重写Object的hashCode方法
     * @return
     */
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
    /**
     * 重写Object的equals方法
     * @return
     */
    @Override
    public boolean equals(final Object o) {
        return EqualsBuilder.reflectionEquals(this,o);
    }
}