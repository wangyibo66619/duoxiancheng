package demo10;

/**
 * @author 王艺博
 * @date 2021/5/23 18:10
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();

        Thread t1 = new Thread(st,"窗口一");
        Thread t2 = new Thread(st,"窗口二");
        Thread t3 = new Thread(st,"窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
