package com.vmware.proxy.dynamic.jdk;

import com.vmware.proxy.pattern.RealSubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxySubject implements InvocationHandler {

    private RealSubject realSubject;

    public JdkProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before...动态代理逻辑");
        Object result;
        try{
            result = method.invoke(realSubject, args);
        }catch (Exception e){
            System.out.println("ex:"+e.getMessage());
            throw e;
        }finally {
            System.out.println("After...动态代理逻辑");
        }
        return result;
    }
}
