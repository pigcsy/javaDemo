package com.adapter;

/**
 * Created by pig on 2017/6/13.
 */

public class Adapter extends Source implements Targetable {

    @Override
    public void methodB() {
        System.out.println("this is the targetable method!");
    }
}
