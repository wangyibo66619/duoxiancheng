package demo08;

/**
 * @author 王艺博
 * @date 2021/5/23 16:36
 */
public class TellTicket implements Runnable{
    private int tickets = 100;
    private Object obj = new Object();
    private int x = 0;
    @Override
    public void run() {
        while (true) {
            if (x%2 == 0) {
//                synchronized (obj) {
                synchronized (this) {
                    if ( tickets > 0 ) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票");
                        tickets--;
                    }
                }
            }else {
//                synchronized (obj) {
//                    if ( tickets > 0 ) {
//                        try {
//                            Thread.sleep(100);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票");
//                        tickets--;
//                    }
//                }
                sellTicket();
            }
            x++;
        }
    }

//    private void sellTicket() {
//        synchronized (obj) {
//            if ( tickets > 0 ) {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票");
//                tickets--;
//            }
//        }
//    }

    private synchronized void sellTicket() {
        if ( tickets > 0 ) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets + "张票");
            tickets--;
        }
    }
}
