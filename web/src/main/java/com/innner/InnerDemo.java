package com.innner;/**
 * Created by maven on 2017/3/1.
 */

import lombok.Data;

/**
 * 内部类
 *
 * @author Maven
 *         <pre>
 *                                     _oo0oo_
 *                                    o8888888o
 *                                    88" . "88
 *                                    (| -_- |)
 *                                    0\  =  /0
 *                                  ___/`---'\___
 *                                .' \\|     |// '.
 *                               / \\|||  :  |||// \
 *                              / _||||| -:- |||||- \
 *                             |   | \\\  -  /// |   |
 *                             | \_|  ''\---/''  |_/ |
 *                             \  .-\__  '-'  ___/-. /
 *                           ___'. .'  /--.--\  `. .'___
 *                        ."" '<  `.___\_<|>_/___.' >' "".
 *                       | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *                       \  \ `_.   \_ __\ /__ _/   .-` /  /
 *                   =====`-.____`.___ \_____/___.-`___.-'=====
 *                                     `=---='
 *                   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *                             佛祖开光         永无BUG
 *                 </pre>
 */
@Data
public class InnerDemo {
    private String name;
    private int age;

    public static void main(String[] args) {
        InnerDemo outerClass = new InnerDemo();
        InnerDemo.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();


        String str1 = "tutorials point", str2 = "http://";
        CharSequence cs1 = "int";
        // string contains the specified sequence of char values
        boolean retval = str1.contains(cs1);
        System.out.println("Method returns : " + retval);
        // string does not contain the specified sequence of char value
        retval = str2.contains("_");
        System.out.println("Methods returns: " + retval);
    }

    /**
     * 省略getter和setter方法
     **/

    public class InnerClass {
        public InnerClass() {
            name = "chenssy";
            age = 23;
        }

        public void display() {
            System.out.println("name：" + getName() + "   ;age：" + getAge());
        }
    }


}

