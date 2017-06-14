package com.factory;

/**
 * Created by pig on 2017/6/13.
 */

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("sms");
    }
}
