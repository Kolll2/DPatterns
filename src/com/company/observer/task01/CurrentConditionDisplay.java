package com.company.observer.task01;

import java.util.Objects;

public class CurrentConditionDisplay implements Observer, DislayElement {

    Subject subject;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(toString());
    }

    @Override
    public void update(Subject subject, Object arg) {
        if (subject instanceof WeatherData){
            WeatherData weatherData = (WeatherData) subject;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public String toString() {
        return "CurrentConditionDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }
}
