package com.hl.magic.dpattern.dp5observer.demo01;

public class ForecastDisplay implements Observer,DisplayElement {
    /**
     * 依赖具体被观察者(主题)
     * @param temp
     * @param humidity
     * @param pressure
     */
    private Subject weathderData;
    /**
     *温度
     */
    private float temperature;
    /**
     *湿度
     */
    private float humidity;
    /**
     *气压
     */
    private float pressure;

    public ForecastDisplay(Subject weathderData) {
        this.weathderData = weathderData;
        //注册
        weathderData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast:");
        System.out.println("temperature" + temperature);
        System.out.println("humidity" + humidity);
        System.out.println("pressure" + pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
