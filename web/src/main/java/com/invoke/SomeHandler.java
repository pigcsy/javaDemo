package com.invoke;/**
 * Created by maven on 2017/3/6.
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 实现代理
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
public class SomeHandler implements InvocationHandler{



    @Override
    public Object invoke(Object proxy, Method method, Object[] params) throws Throwable {
// Your complex business validation and logic

        Object result = method.invoke(CalculatorImpl.class,params);
        return result;
    }
}
