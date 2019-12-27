package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

/**
 * Created by MoBai on 2019/12/24.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}