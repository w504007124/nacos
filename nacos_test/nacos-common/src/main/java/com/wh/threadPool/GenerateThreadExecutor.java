package com.wh.threadPool;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.stereotype.Component;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 什么？我是真滴帅
 *
 * @author LiXuekai on 2021/9/26
 */
@Component
//@Slf4j
public class GenerateThreadExecutor {
//    @Getter
    private ExecutorService taskExecutor;
    private int corePoolSize = 50;
    public GenerateThreadExecutor(){
        taskExecutor = Executors.newFixedThreadPool(corePoolSize);
    }

    public <T> Future<T> submit(Callable<T> task){
        return taskExecutor.submit(task);
    }
}
