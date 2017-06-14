package com.abstractFactory;

import com.factory.Sender;

/**
 * Created by pig on 2017/6/13.
 */

public class FactoryTest {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.send();
    }
}
