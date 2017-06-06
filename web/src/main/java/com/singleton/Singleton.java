package com.singleton;

/**
 * Created by maven on 2017/2/8.
 */
class Singleton {
    public static int couter1;
    public static int couter2 = 0;
    private static Singleton singleton = new Singleton();

    private Singleton() {
        couter1++;
        couter2++;
    }

    public static Singleton getInstance() {
        return singleton;
    }

    public static class myTest {
        public static void main(String[] args) {
            Singleton singleton = Singleton.getInstance();
            System.out.println("counter1=" + singleton.couter1);
            System.out.println("counter2=" + singleton.couter2);
        }
    }
}
