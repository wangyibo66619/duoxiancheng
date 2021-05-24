package demo11;

/**
 * @author 王艺博
 * @date 2021/5/24 8:49
 */
public class Producer implements Runnable{
    private Box box;
    public Producer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            box.put(i);
        }
    }
}
