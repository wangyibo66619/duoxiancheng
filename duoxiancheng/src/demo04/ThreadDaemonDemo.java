package demo04;

import java.util.TreeSet;

/**
 * @author 王艺博
 * @date 2021/5/23 14:15
 */
/*
        void setDaemon(boolean on) 将此线程标记为 daemon线程或用户线程。
 */
public class ThreadDaemonDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();


        td1.setName("张飞");
        td2.setName("关羽");
        // 设置主线程刘备
        Thread.currentThread().setName("刘备");
        Thread.sleep(1000);

        // 设置守护线程
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
