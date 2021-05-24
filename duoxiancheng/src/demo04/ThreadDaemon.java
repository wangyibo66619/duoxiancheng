package demo04;

/**
 * @author 王艺博
 * @date 2021/5/23 14:14
 */
public class ThreadDaemon extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
