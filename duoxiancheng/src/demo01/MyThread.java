package demo01;

/**
 * @author 王艺博
 * @date 2021/5/23 11:14
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
