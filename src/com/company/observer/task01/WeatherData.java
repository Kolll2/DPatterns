package com.company.observer.task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WeatherData implements Subject {
    List<Observer> observersList;

    boolean isChanged = false;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observersList = new ArrayList<>();
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    private void setChanged() {
        isChanged = true;
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (Objects.nonNull(observer)){
            observersList.add(observer);
        } else {
            throw new NullPointerException("WeatherData method registerObserver will come Null argument Observer observer");
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (Objects.nonNull(observer)){
            observersList.remove(observer);
        } else {
            throw new NullPointerException("WeatherData method removeObserver will come Null argument Observer observer");
        }
    }

    @Override
    public void notifyObservers() {
        if (isChanged)
            for (int i = 0; i < observersList.size(); i++) {
                observersList.get(i).update(this, null);
            }
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
