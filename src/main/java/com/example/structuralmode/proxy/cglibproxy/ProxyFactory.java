package com.example.structuralmode.proxy.cglibproxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @Author: kabudac
 * @Date: 2022-04-17 14:28:01
 * @Description:
 */
public class ProxyFactory implements MethodInterceptor {

    private TrainStation target = new TrainStation();

    public TrainStation getProxyObject() {
        // 创建Enhancer对象，类似于JDK动态代理的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理类对象
        return (TrainStation) enhancer.create();
    }

    /*
     * intercept方法参数说明：
     * o ： 代理对象
     * method ： 真实对象中的方法的Method实例
     * args ： 实际参数
     * methodProxy ：代理对象中的方法的method实例
     */
    @Override
    public TrainStation intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("代理点收取一些服务费用(CGLIB动态代理方式)");

        System.out.println(method.getName());
        return (TrainStation) methodProxy.invokeSuper(o, args);
    }

}
