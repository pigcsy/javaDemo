package com.factory;

/**
 * Created by pig on 2017/6/13.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("mail");
    }
}
