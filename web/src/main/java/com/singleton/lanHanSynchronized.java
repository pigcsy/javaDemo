package com.singleton;

/**
 * Created by pig on 2017/6/13.
 */

public class lanHanSynchronized {
    //懒汉（存在线程问题）
    private static lanHanSynchronized instance = null;

    private lanHanSynchronized() {
    }

    // public static synchronized lanHanSynchronized getInstence(){
    //     if (instance == null)
    //         instance = new lanHanSynchronized();
    //     return instance;
    // }
    //双重锁定
    public static lanHanSynchronized getInstence() {
        if (instance == null) {
            synchronized (lanHanSynchronized.class) {
                if (instance == null) {
                    instance = new lanHanSynchronized();
                }
            }
        }
        return instance;
    }
}
