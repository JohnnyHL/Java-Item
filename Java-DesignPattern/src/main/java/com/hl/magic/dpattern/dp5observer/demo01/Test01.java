package com.hl.magic.dpattern.dp5observer.demo01;

public class Test01 {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(12,12,12);
        weatherData.setMeasurements(13,13,13);
        currentConditionDisplay.update(12,12,12);
        currentConditionDisplay.display();
        statisticDisplay.update(12,12,12);
        statisticDisplay.display();
        forecastDisplay.update(11,11,11);
        forecastDisplay.display();
    }
}
