package demo10;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 王艺博
 * @date 2021/5/23 18:10
 */
/*
    lock中提供了获得锁和释放锁的方法：
        void lock():获得锁
        void unlock():获得锁
    lock是接口不能被实例化，这里采用它的实现类ReentrantLock来实例化
        ReentrantLock()：创建一个ReentrantLock的实例
 */
public class SellTicket implements Runnable{
    private int tickets = 100;
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if ( tickets > 0 ) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--;
                }
            }finally {
                lock.unlock();
            }

        }
    }
}
