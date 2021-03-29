package com.hl.magic.dpattern.dp5observer.demo01;

import java.util.ArrayList;

/**
 * 观察者模式
 * demo:气象站的设计
 * 需求：已知WeatherData类，提供获取温度、湿度、气压的方法、
 *      现在需要增加三个使用天气数据的布告板，分别是“目前状况”布告、“天气预报”布告、“气象统计”布告。
 *      并且要求这些布告是可以拓展的，也就是可以增加其他布告板。
 * 分析：该案例是典型的观察者模式，气象站需要给出布告板数据，而布告板展示数据。
 */
public class WeatherData implements Subject{
    /**
     * 实现具体主题
     */
    /**
     *依赖观察者：Subject包含多个Observer
     */
    private ArrayList<Observer> observers;
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

    public WeatherData(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    public WeatherData() {

    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.indexOf(observer) >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer :observers) {
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 新的测量数据备好后会被调用
     */
    public void measurementsChanged(){
        notifyObserver();
    }
    public void setMeasurements(float temp, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
