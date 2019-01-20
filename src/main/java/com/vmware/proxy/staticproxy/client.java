package com.vmware.proxy.staticproxy;

import com.vmware.proxy.pattern.RealSubject;
import com.vmware.proxy.pattern.Subject;

public class client {

    public static void main(String[] args){
        Subject subject = new Proxy(new RealSubject());
        subject.request();
    }
}
