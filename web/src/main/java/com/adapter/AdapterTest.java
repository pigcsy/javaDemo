package com.adapter;

/**
 * Created by pig on 2017/6/13.
 */

public class AdapterTest {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.methodA();
        target.methodB();
    }
}
