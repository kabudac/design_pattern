/**
 * @Author: kabudac
 * @Date: 2022-04-27 20:19:52
 * @Description: 环境类
 */
package com.example.behavioralpattern.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<Variable,Integer> map = new HashMap<>();

    public void assign(Variable var,Integer value) {
        map.put(var,value);
    }

    public int getValue(Variable var) {
        return map.get(var);
    }
}
