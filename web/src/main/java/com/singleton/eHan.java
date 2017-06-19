package com.singleton;

/**
 * Created by pig on 2017/6/13.
 */

public class eHan {
    private static eHan instance = new eHan();

    //饿汉（不存在线程问题）
    private eHan() {
    }

    public static eHan getInstance() {
        return instance;
    }

    public static void main(String[] args) {
    }
}
