package com.netease.work.mock.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * description:
 * Date: 2019-08-19 下午10:46<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class TestShutDown {

    static void asynExecuteOne() throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("--async executor one ---");
                    }
                }
        );
        executorService.shutdownNow();
    }

    static void asynExecutorTwo() throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("--async executor two ---");

            }
        });
        executorService.shutdownNow();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("----");
        asynExecuteOne();
        asynExecutorTwo();
        System.out.println("-----");
    }
}
