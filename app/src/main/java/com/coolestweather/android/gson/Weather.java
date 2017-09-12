package com.coolestweather.android.gson;

import android.graphics.SumPathEffect;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by HeTian on 2017/9/12.
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
