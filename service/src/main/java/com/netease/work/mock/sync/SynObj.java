package com.netease.work.mock.sync;

/**
 * description:
 * Date: 2018-12-31 下午4:17<br/>
 *
 * @author wuchanming
 * @version 1.0
 */
public class SynObj {
    public synchronized void methodA() {
        System.out.println("methodA.....");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public  void methodB() {
        synchronized(this){
            System.out.println("methodB.....");
        }
    }

    public void methodC() {
        String str = "sss";
        synchronized (str) {
            System.out.println("methodC.....");
        }
    }

    public synchronized static void methodD() {
        System.out.println("methodD.....");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public  void methodE() {
        synchronized(SynObj.class){
            System.out.println("methodE.....");
        }
    }

    public static void main(String[] args) {
        final SynObj obj = new SynObj();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.methodA();
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.methodB();
            }
        });
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.methodC();
            }
        });
        t3.start();

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                SynObj.methodD();
            }
        });
        t4.start();


        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.methodE();
            }
        });
        t5.start();
    }
}
