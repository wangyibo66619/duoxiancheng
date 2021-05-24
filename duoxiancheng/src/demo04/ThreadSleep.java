package demo04;

/**
 * @author 王艺博
 * @date 2021/5/23 14:13
 */
/*
    static void sleep(long millis) 使当前正在执行的线程停留（暂停执行）指定的毫秒数，这取决于系统定时器和调度程序的精度和准确性
 */
public class ThreadSleep extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
