package com.example.behavioralpattern.interpreter;

/**
 * @Author: kabudac
 * @Date: 2022-04-27 20:27:59
 * @Description: 终结符表达式角色 变量表达式
 */
public class Variable extends AbstractExpression {

    private String name;

    @Override
    public int interpret(Context context) {

        return context.getValue(this);
    }

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
