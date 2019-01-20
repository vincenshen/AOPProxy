package com.vmware.proxy.staticproxy;


import com.vmware.proxy.pattern.RealSubject;
import com.vmware.proxy.pattern.Subject;

/**
 * 设计模式 - 静态代理
 * 缺点：代理的方法越多，重复的逻辑越多
 * 可以通过动态代理来实现：基于接口 与 基于继承代理
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("before");
        try {
            realSubject.request();
        }catch (Exception e){
            System.out.println("exception:"+ e.getMessage());
            throw e;
        }finally {
            System.out.println("after");
        }
    }
}
