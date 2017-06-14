package com.factory;

/**
 * Created by pig on 2017/6/13.
 */

public class SendMailFactory implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
