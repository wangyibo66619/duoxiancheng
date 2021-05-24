package demo03;

/**
 * @author 王艺博
 * @date 2021/5/23 13:46
 */
public class ThreadPriority extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
