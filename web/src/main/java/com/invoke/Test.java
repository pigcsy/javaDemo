package com.invoke;
/**
 * Created by maven on 2017/3/6.
 */


import java.lang.reflect.Field;

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
public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        // CalculatorImpl calcImpl = new CalculatorImpl();
        //三种获取类的方式
        Class a = Class.forName("com.invoke.CalculatorImpl");
        System.out.println(a);

        // Class b= CalculatorImpl.class;
        // System.out.println(b);
        //
        // CalculatorImpl calculator=new CalculatorImpl();
        // Class c=calculator.getClass();
        // System.out.println(c);

        // try {
        //     Object oa=a.newInstance();
        //     System.out.println(oa.toString());
        // } catch (InstantiationException e) {
        //     e.printStackTrace();
        // } catch (IllegalAccessException e) {
        //     e.printStackTrace();
        // }
        Field[] fa = a.getDeclaredFields();
        System.out.println(fa.toString());

        Class[] fas = a.getInterfaces();
        for (int i = 0; i < fas.length; i++) {
            System.out.println((i + 1) + "：" + fas[i].getName());
        }

        //Calculator proxied =(Calculator)ProxyFactory.getHandler(Calculator.class, calcImpl, new SomeHandler(calcImpl));
        // (Calculator) ProxyFactory.getProxy (Calculator.class, calcImpl, new SomeHandler(calcImpl));
        // int result = proxied.Calculate(20, 10);
        // System.out.println("FInal Result :::" + result);
    }
}
