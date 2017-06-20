package com.jdk8;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/**
 * Created by maven on 2017/4/5.
 */

public class FristDome {
    //创建订阅者
    Subscriber<String> subscriber = new Subscriber<String>() {
        @Override
        public void onSubscribe(Subscription s) {
            //这一步是必须，我们通常可以在这里做一些初始化操作，调用request()方法表示初始化工作已经完成
            //调用request()方法，会立即触发onNext()方法
            //在onComplete()方法完成，才会再执行request()后边的代码
            s.request(Long.MAX_VALUE);
        }

        @Override
        public void onNext(String value) {
            System.out.println("aaa");
        }

        @Override
        public void onError(Throwable t) {
            System.out.println("bbb");
        }

        @Override
        public void onComplete() {
            //由于Reactive-Streams的兼容性，方法onCompleted被重命名为onComplete
            System.out.println("ccc");
        }
    };

    public void frist() {
        Flowable.create(new FlowableOnSubscribe<String>() {
            @Override
            public void subscribe(FlowableEmitter<String> e) throws Exception {
                e.onNext("Hello,I am China!");
            }
        }, BackpressureStrategy.BUFFER).subscribe(subscriber);
    }



}
