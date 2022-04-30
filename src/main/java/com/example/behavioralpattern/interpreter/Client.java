package com.example.behavioralpattern.interpreter;

/**
 * @Author: kabudac
 * @Date: 2022-04-28 10:08:44
 * @Description: 
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        context.assign(a, 1);
        context.assign(b, 2);
        context.assign(c, 3);
        context.assign(d, 4);

        AbstractExpression expression = new Minus(new Plus(new Plus(a, b), c), d);

        System.out.println(expression + "= " + expression.interpret(context));
    }
}
