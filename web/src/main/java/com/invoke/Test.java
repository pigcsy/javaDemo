package com.invoke;/**
 * Created by maven on 2017/3/6.
 */


/**
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
public class Test {
    public static void main(String[] args) {
        CalculatorImpl calcImpl = new CalculatorImpl();
        //Calculator proxied =(Calculator)ProxyFactory.getHandler(Calculator.class, calcImpl, new SomeHandler(calcImpl));
               // (Calculator) ProxyFactory.getProxy (Calculator.class, calcImpl, new SomeHandler(calcImpl));
       // int result = proxied.Calculate(20, 10);
       // System.out.println("FInal Result :::" + result);
    }
}
