package demo05;

/**
 * @author ηθΊε
 * @date 2021/5/23 15:06
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i );
        }
    }
}
