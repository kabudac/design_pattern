package com.example.behavioralpattern.interpreter;

/**
 * @Author: kabudac
 * @Date: 2022-04-27 20:26:14
 * @Description:
 */
public class Value extends AbstractExpression{
    private int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

}
