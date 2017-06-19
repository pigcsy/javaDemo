package com.rxjava;


import rx.Observable;
import rx.Observer;
import rx.Subscriber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maven on 2017/2/8.
 */
public class Fristrxjava {
    Observable<String> sender = Observable.create(new Observable.OnSubscribe<String>() {

        @Override
        public void call(Subscriber<? super String> subscriber) {

            subscriber.onNext("Hi，world！");
        }
    });

    Observer<String> receiver = new Observer<String>() {
        @Override
        public void onCompleted() {


            //数据接收完成时调用
        }

        @Override
        public void onError(Throwable e) {

            //发生错误调用
        }

        @Override
        public void onNext(String s) {

            //正常接收数据调用
            System.out.print(s);  //将接收到来自sender的问候"Hi，Weavey！"
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Fristrxjava fristrxjava = new Fristrxjava();
        //fristrxjava.sender.subscribe(fristrxjava.receiver);
        // System.out.println(Observable.range(10, 5));
        // System.out.println(Observable.timer(3, TimeUnit.SECONDS));
        //Observable.just("hi dear").repeat(3);//重复发射3次
        // Thread.sleep(1000);

        Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("create1"); //发射一个"create1"的String
                subscriber.onNext("create2"); //发射一个"create2"的String
                subscriber.onCompleted();//发射完成,这种方法需要手动调用onCompleted，才会回调Observer的onCompleted方法
            }
        });

        List<String> list = new ArrayList<>();
        list.add("from1");
        list.add("from2");
        list.add("from3");
        Observable.from(list);
        System.out.println(Observable.from(list));  //遍历list 每次发送一个
    }

}
