package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by QMPC-151 on 2019/04/09.
 */

public class Country extends DataSupport {
    private int mId;
    private String mCountryName;
    private String mWeatherCode;
    private int mCityId;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getCountryName() {
        return mCountryName;
    }

    public void setCountryName(String countryName) {
        mCountryName = countryName;
    }

    public String getWeatherCode() {
        return mWeatherCode;
    }

    public void setWeatherCode(String weatherCode) {
        mWeatherCode = weatherCode;
    }

    public int getCityId() {
        return mCityId;
    }

    public void setCityId(int cityId) {
        mCityId = cityId;
    }
}
