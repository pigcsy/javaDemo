package com.abstractFactory;

import com.factory.MailSender;
import com.factory.Sender;
import com.factory.SmsSender;

/**
 * Created by pig on 2017/6/13.
 */

public class SendFactory {

    public static Sender produceMail(){
        return new MailSender();
    }
    public static Sender produceSms(){
        return new SmsSender();
    }
}