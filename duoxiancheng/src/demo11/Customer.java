package demo11;

/**
 * @author 王艺博
 * @date 2021/5/24 8:50
 */
public class Customer implements Runnable{
    private Box box;
    public Customer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            box.get();
        }
    }
}
