package com.example.weatherretrofit;

public class WeatherData {
    class Weather{
        String description;
    }
    class Main{
        double temp;
        int humidity;
        int pressure;
    }
    class Wind{
        double speed;
    }
    class Sys{
        long sunrise;
    }
    Weather [] weather;
    Main main;
    Wind wind;
    Sys sys;
}
