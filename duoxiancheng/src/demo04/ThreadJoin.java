package demo04;

/**
 * @author ηθΊε
 * @date 2021/5/23 14:13
 */
public class ThreadJoin extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
