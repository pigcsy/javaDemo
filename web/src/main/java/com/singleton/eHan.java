package com.singleton;

/**
 * Created by pig on 2017/6/13.
 */

public class eHan {
    //饿汉（不存在线程问题）
    private eHan(){}

    private static eHan instance=new eHan();

    public static eHan getInstance(){
        return instance;
    }

    public static void main(String[] args) {
    }
}
