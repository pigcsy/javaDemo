package com.factory;

/**
 * Created by pig on 2017/6/13.
 */

public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
