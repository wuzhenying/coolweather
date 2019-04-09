package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by QMPC-151 on 2019/04/09.
 */

public class City extends DataSupport {
    private int mId;
    private String mCityName;
    private int mCityCode;
    private int mProvinceId;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getCityName() {
        return mCityName;
    }

    public void setCityName(String cityName) {
        mCityName = cityName;
    }

    public int getCityCode() {
        return mCityCode;
    }

    public void setCityCode(int cityCode) {
        mCityCode = cityCode;
    }

    public int getProvinceId() {
        return mProvinceId;
    }

    public void setProvinceId(int provinceId) {
        mProvinceId = provinceId;
    }
}
