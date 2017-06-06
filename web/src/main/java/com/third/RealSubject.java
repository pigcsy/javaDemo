package com.third;

import static java.lang.System.exit;
import static java.lang.System.out;

/**
 * Created by maven on 2017/1/5.
 */
public class


RealSubject extends Subject {
    public RealSubject() {
    }

    public void request() {
        out.println(" From real subject. ");
        exit(0);
    }
}
