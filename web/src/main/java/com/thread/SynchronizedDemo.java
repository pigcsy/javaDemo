package com.thread;/**
 * Created by maven on 2017/3/1.
 */

/**
 * 同步代码块 demo
 *
 * @author Maven
 *         <pre>
 *                             _oo0oo_
 *                            o8888888o
 *                            88" . "88
 *                            (| -_- |)
 *                            0\  =  /0
 *                          ___/`---'\___
 *                        .' \\|     |// '.
 *                       / \\|||  :  |||// \
 *                      / _||||| -:- |||||- \
 *                     |   | \\\  -  /// |   |
 *                     | \_|  ''\---/''  |_/ |
 *                     \  .-\__  '-'  ___/-. /
 *                   ___'. .'  /--.--\  `. .'___
 *                ."" '<  `.___\_<|>_/___.' >' "".
 *               | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *               \  \ `_.   \_ __\ /__ _/   .-` /  /
 *           =====`-.____`.___ \_____/___.-`___.-'=====
 *                             `=---='
 *           ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *                     佛祖开光         永无BUG
 *         </pre>
 */
public class SynchronizedDemo {
    public synchronized void m1() throws InterruptedException{
        System. out.println("m1 call" );
        // Thread. sleep(3000);
        System. out.println("m1 call done" );
        //Thread. wait(3000);

    }

    public synchronized void m2() throws InterruptedException{
        synchronized (this ) {
            System. out.println("m2 call" );
            Thread.sleep(1000);
            System. out.println("m2 call done" );
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final SynchronizedDemo thisObj  = new SynchronizedDemo();

        Thread t1 = new Thread(){
            @Override
            public void run() {
                try {
                    thisObj.m1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


        Thread t2 = new Thread(){
            @Override
            public void run() {
                try {
                    thisObj.m1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t1.start();
        System.out.println(t1.toString());
        t2.start();

    }
}
