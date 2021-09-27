package com.wh.callnable;

import java.util.concurrent.Callable;
/**
 * 什么？我是真滴帅
 *
 * @author LiXuekai on 2021/9/26
 */
public class TestCallnable implements Callable<Object> {

    private int param1;

    public TestCallnable(int param1){
        this.param1 = param1;
    }

    public Object call() throws Exception {
        for(int x = 0 ; x < 100 ; x ++) {
            System.out.println(Thread.currentThread().getName()+":"+x+"========================="+param1);
        }
        return null;
    }
}
