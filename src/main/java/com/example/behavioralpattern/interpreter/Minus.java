package com.example.behavioralpattern.interpreter;
/**
 * @Author: kabudac
 * @Date: 2022-04-28 10:14:07
 * @Description: 
 */
public class Minus extends AbstractExpression{

    private AbstractExpression left;
    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }
    
}

