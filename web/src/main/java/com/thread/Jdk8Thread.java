package com.thread;

import java.time.Instant;

/**
 * Created by pig on 2017/6/21.
 */

public class Jdk8Thread {
    public static void main(String[] args) {
        int s = Instant.now().getNano();
        Thread thread = new Thread(() -> {
            String threadName =Thread.currentThread().getName();
            for (int i = 1; i <= 100; i++) {
                System.out.println(i);
                System.out.println(threadName);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        );
        thread.start();
        int e = Instant.now().getNano();
        System.out.println(e - s);
        System.out.println("---------==============----------");
        int s1 = Instant.now().getNano();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {

                }
            }
        });
        thread1.start();
        int e1 = Instant.now().getNano();
        System.out.println(e1 - s1);

        System.out.println("---------==============----------");
        int s2 = Instant.now().getNano();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {

                }
            }
        });
        thread2.start();
        int e2 = Instant.now().getNano();
        System.out.println(e2 - s2);



    }
}
