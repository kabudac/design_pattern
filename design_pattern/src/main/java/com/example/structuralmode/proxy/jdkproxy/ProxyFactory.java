package com.example.structuralmode.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import com.example.structuralmode.proxy.SellTickets;
import com.example.structuralmode.proxy.TrainStation;

/**
* @Author: kabudac
 * @Date: 2022-04-17 10:49:24
 * @Description:
 */
public class ProxyFactory {
    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject(){
        SellTickets sellTickets = (SellTickets) Proxy.newProxyInstance(station.getClass().getClassLoader(), station.getClass().getInterfaces(), new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代理点收取一些服务费用(JDK动态代理方式)");

                //执行真实对象
                Object result = method.invoke(station,args);
                return result;
            }

        });
        return sellTickets;

    }
}
