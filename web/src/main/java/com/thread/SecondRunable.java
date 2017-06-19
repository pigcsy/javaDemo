package com.thread;

/**
 * Created by maven on 2017/2/13.
 */
public class SecondRunable implements Runnable {
    /**
     * @functon 多线程学习 继承runnable，资源能共享
     */
    private int count = 15;

    public static void main(String[] args) {

        SecondRunable my = new SecondRunable();
        new Thread(my, "C").start();//同一个mt，但是在Thread中就不可以，如果用同一个实例化对象mt，就会出现异常
        new Thread(my, "D").start();
        new Thread(my, "E").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "运行  count= " + count--);
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
