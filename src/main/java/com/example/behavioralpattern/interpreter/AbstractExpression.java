package com.example.behavioralpattern.interpreter;

/**
 * @Author: kabudac
 * @Date: 2022-04-27 20:18:56
 * @Description: 
 */
public abstract class AbstractExpression {
    
    public abstract int interpret(Context context);
}
