package com.example.learnprogect.ServicePackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

//每日天气信息
public class EveryDayWeather {
    //日期
    String date;
    //白天天气
    String dayStr[];
    //夜间天气
    String nightStr[];

    public EveryDayWeather(JSONObject weather) {
        try {
            date = weather.getString("date");

            JSONObject info = weather.getJSONObject("info");
            JSONArray day = info.getJSONArray("dayStr");
            JSONArray night = info.getJSONArray("night");
            //将读取的白天天气数据读取到dayStr中
            for (int i = 0; i < day.length(); i++) {
                dayStr[i] = day.getString(i);
            }
            //将读取的晚上天气数据读取到nightStr中
            for (int i = 0; i < night.length(); i++) {
                nightStr[i] = night.getString(i);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
