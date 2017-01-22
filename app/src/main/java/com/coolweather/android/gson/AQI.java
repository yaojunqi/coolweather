package com.coolweather.android.gson;

/**
 * Created by xing on 2017/1/20.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
