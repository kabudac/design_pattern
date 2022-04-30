package com.example.framework.utils;

/**
 * @Author: kabudac
 * @Date: 2022/4/30 22:31
 * @Description:
 */
public class StringUtils {

    public static String getSetterMethodByFieldName(String fieldName) {
        return "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
    }
}
