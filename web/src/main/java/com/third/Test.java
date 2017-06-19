package com.third;

/**
 * Created by maven on 2017/1/5.
 */
public class Test {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public volatile int count = 0;

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    //这里延迟1毫秒，使得结果明显
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    count++;
                    System.out.println("--------" + count);
                }
            }
        }).start();

    }

    public interface Reflect {
        public void doSomething();
    }

}

