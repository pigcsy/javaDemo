package com.thread;/**
 * Created by maven on 2017/3/1.
 */

/**
 * @author Maven
 *         <pre>
 *                                             _oo0oo_
 *                                            o8888888o
 *                                            88" . "88
 *                                            (| -_- |)
 *                                            0\  =  /0
 *                                          ___/`---'\___
 *                                        .' \\|     |// '.
 *                                       / \\|||  :  |||// \
 *                                      / _||||| -:- |||||- \
 *                                     |   | \\\  -  /// |   |
 *                                     | \_|  ''\---/''  |_/ |
 *                                     \  .-\__  '-'  ___/-. /
 *                                   ___'. .'  /--.--\  `. .'___
 *                                ."" '<  `.___\_<|>_/___.' >' "".
 *                               | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *                               \  \ `_.   \_ __\ /__ _/   .-` /  /
 *                           =====`-.____`.___ \_____/___.-`___.-'=====
 *                                             `=---='
 *                           ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *                                     佛祖开光         永无BUG
 *                         </pre>
 */
public class MyTest implements Runnable {

    public static void main(String[] args) {
        MyTest test = new MyTest();
        test.run();
    }

    public void run() {
        Thread t1 = new Thread() {
            public void run() {
                System.out.println("aaa");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new Thread(() -> System.out.println("b"));
        System.out.println("t1 start");
        t1.start();
        try {
            t1.wait(1000);
            System.out.println("t2 start");
            t2.start();
            System.out.println("t2 end");
            t1.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("t1 end");

    }
}
