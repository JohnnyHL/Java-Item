package com.hl.magic.base.basecode.Entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 模型对象基础类，原则上一切model类均继承该类，方便做统一处理
 * @author hl
 * @date 2019/9/20
 */
public class BaseEntity implements Serializable {


    private static final long serialVersionUID = 2927963057417181543L;

    /**
     * 自动列出本BEAN的所有属性
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.MULTI_LINE_STYLE);
    }

    /**
     * 覆盖Object的HashCode方法
     */
    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * 覆盖Object的equals方法
     */
    @Override
    public boolean equals(final Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }


}
