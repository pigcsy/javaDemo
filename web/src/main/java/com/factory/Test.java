package com.factory;

/**
 * Created by pig on 2017/6/13.
 */

public class Test {
    public static void main(String[] args) {
        Provider provider=new SendMailFactory();
        Provider provider1=new SendSmsFactory();
        Sender sender=provider.produce();
        Sender sender1=provider1.produce();
        sender.send();
        sender1.send();
    }
}
