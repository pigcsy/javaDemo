package com;/**
 * Created by maven on 2017/3/1.
 */

import lombok.Data;

/**
 * 内部类
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
@Data
public class innerDemo {
        private String name ;
        private int age;

        /**省略getter和setter方法**/

        public class InnerClass{
            public InnerClass(){
                name = "chenssy";
                age = 23;
            }

            public void display(){
                System.out.println("name：" + getName() +"   ;age：" + getAge());
            }
        }

        public static void main(String[] args) {
            innerDemo outerClass = new innerDemo();
            innerDemo.InnerClass innerClass = outerClass.new InnerClass();
            innerClass.display();
        }


    }

