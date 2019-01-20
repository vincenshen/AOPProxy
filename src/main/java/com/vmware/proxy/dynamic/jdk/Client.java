package com.vmware.proxy.dynamic.jdk;

import com.vmware.proxy.pattern.RealSubject;
import com.vmware.proxy.pattern.Subject;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args){
       Subject subject = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[]{Subject.class}, new JdkProxySubject(new RealSubject()));
       subject.request();
    }
}
