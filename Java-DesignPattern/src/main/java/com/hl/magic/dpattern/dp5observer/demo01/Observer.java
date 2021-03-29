package com.hl.magic.dpattern.dp5observer.demo01;

/**
 * 观察者接口：所有潜在的观察者必须实现观察者接口
 *            该demo中只有一个update方法，当Subject主题状态改变时，它将被调用。
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
