
package com.project.kafka.api.json.common;

public class Weather {

    private String city;
    private String state;
    private Integer temperature;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", temperature=" + temperature +
                '}';
    }
}

