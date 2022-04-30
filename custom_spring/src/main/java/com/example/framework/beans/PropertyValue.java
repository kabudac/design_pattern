package com.example.framework.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: kabudac
 * @Date: 2022/4/30 14:17
 * @Description: 用来封装bean表标签下的property标签的属性
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertyValue {
    private String name;
    private String ref;
    private String value;
}
