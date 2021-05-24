package demo02;

/**
 * @author 王艺博
 * @date 2021/5/23 12:35
 */
public class MyThread extends Thread{
    public MyThread() {
    }
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(getName() + i);
        }
    }
/*
private String name;
public Thread() {
        init(null, null, "Thread-" + nextThreadNum(), 0);
    }
public Thread(String name) {
        init(null, null, name, 0);
    }
private void init(ThreadGroup g, Runnable target, String name,
                      long stackSize) {
        init(g, target, name, stackSize, null, true);
    }
private void init(ThreadGroup g, Runnable target, String name,
                      long stackSize, AccessControlContext acc,
                      boolean inheritThreadLocals) {
        this.name = name;
                      }
public final synchronized void setName(String name) {
        this.name = name;
    }
public final String getName() {
        return name;
    }
private static int threadInitNumber;// 默认值0  ,1,2
private static synchronized int nextThreadNum() {
    return threadInitNumber++;0,1
}

*/
}
