package com.wh.mq;

import com.wh.callnable.TestCallnable;
import com.wh.threadPool.GenerateThreadExecutor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 什么？我是真滴帅
 *
 * @author LiXuekai on 2021/9/26
 */
public class test {
    public static void main(String[] args) {
        System.out.println("主线程ID是： " + Thread.currentThread().getId());

        Thread t1 = new MyThread("线程1");
        t1.start();

        Thread t2 = new MyThread("线程2");
        t2.run();

        GenerateThreadExecutor generateThreadExecutor = new GenerateThreadExecutor();

        TestCallnable tt1 = new TestCallnable(1);
        TestCallnable tt2 = new TestCallnable(2);

        Future<Object> future = generateThreadExecutor.submit(tt1);
        Future<Object> future2 = generateThreadExecutor.submit(tt2);
//
//        //创建线程池对象
//        ExecutorService pool = Executors.newFixedThreadPool(2) ;
//
//        pool.submit(new TestCallnable(1));
//        pool.submit(new TestCallnable(2));

//        pool.shutdown();

    }
}
//class TestCallnable implements Callable<Object> {
//
//    public Object call() throws Exception {
//        for(int x = 0 ; x < 100 ; x ++) {
//            System.out.println(Thread.currentThread().getName()+":"+x);
//        }
//        return null;
//    }
//}

class MyThread extends Thread{
    /**
     * 线程名称
     */
    private String name;

    public MyThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("名称:"+ name + "的线程ID是："+Thread.currentThread().getId());
    }
}
