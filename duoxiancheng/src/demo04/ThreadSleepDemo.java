package demo04;

/**
 * @author 王艺博
 * @date 2021/5/23 14:13
 */
public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();

        ts1.setName("武松");
        ts2.setName("刘备");
        ts3.setName("杨志");

        ts1.start();
        ts2.start();
        ts3.start();
    }
}
