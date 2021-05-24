package demo11;

/**
 * @author 王艺博
 * @date 2021/5/24 8:45
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box();
        // 生产者对象
        Producer p = new Producer(box);
        // 消费者对象
        Customer c = new Customer(box);

        Thread tp = new Thread(p);
        Thread tc = new Thread(c);

        tp.start();
        tc.start();
    }
}
