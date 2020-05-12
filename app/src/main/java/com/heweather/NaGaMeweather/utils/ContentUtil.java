package com.heweather.NaGaMeweather.utils;


import com.heweather.NaGaMeweather.MyApplication;


public class ContentUtil {

    //用户id
    public static final String He_USERNAME = "HE1903211415311839";
    //用户key
    public static final String He_KEY = "a7b3fdf76a2b44fc91e36b2afe63d080";
    //当前所在位置
    public static Double NOW_LON = 116.40;
    public static Double NOW_LAT = 39.9;

    //当前城市
    public static String NOW_CITY_ID = SpUtils.getString(MyApplication.getContext(), "lastLocation", "CN101010100");
    public static String NOW_CITY_NAME = SpUtils.getString(MyApplication.getContext(), "nowCityName", "北京");

    public static boolean FIRST_OPEN = SpUtils.getBoolean(MyApplication.getContext(), "first_open", true);

    //应用设置里的文字
    public static String SYS_LANG = "zh";
    public static String APP_SETTING_LANG = SpUtils.getString(MyApplication.getContext(), "language", "sys");
    public static String APP_SETTING_UNIT = SpUtils.getString(MyApplication.getContext(), "unit", "she");
    public static String APP_SETTING_TESI = SpUtils.getString(MyApplication.getContext(), "size", "mid");
    public static String APP_PRI_TESI = SpUtils.getString(MyApplication.getContext(), "size", "mid");
    public static String APP_SETTING_THEME = SpUtils.getString(MyApplication.getContext(), "theme", "浅色");


    public static boolean UNIT_CHANGE = false;
    public static boolean CHANGE_LANG = false;
    public static boolean CITY_CHANGE = false;

}
