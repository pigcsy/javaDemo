package com.singleton;

/**
 * Created by pig on 2017/6/13.
 */

public class lanHanNoSynchronized {
    private lanHanNoSynchronized(){
    }
     private  static lanHanNoSynchronized instance=null;

    public static lanHanNoSynchronized getInstence(){
        if (instance == null)
            instance = new lanHanNoSynchronized();
        return instance;
    }

}
