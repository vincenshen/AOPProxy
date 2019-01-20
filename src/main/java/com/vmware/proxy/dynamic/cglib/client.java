package com.vmware.proxy.dynamic.cglib;

import com.vmware.proxy.pattern.RealSubject;
import com.vmware.proxy.pattern.Subject;
import org.springframework.cglib.proxy.Enhancer;

public class client {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new CglibProxySubject());
        Subject subject = (Subject) enhancer.create();
        subject.request();
    }
}
