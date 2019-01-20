package com.vmware.proxy.dynamic.cglib;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxySubject implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before...动态代理逻辑");
        Object result;
        try{
            result = methodProxy.invokeSuper(o, objects);
        }catch (Exception ex){
            System.out.println("get ex:" + ex.getMessage());
            throw ex;
        }finally {
            System.out.println("After...动态代理逻辑");
        }
        return result;
    }
}
