package demo08;

/**
 * @author 王艺博
 * @date 2021/5/23 16:36
 */
public class SellTicketDemo{
    public static void main(String[] args) {
        TellTicket tt = new TellTicket();

        Thread t1 = new Thread(tt,"窗口一");
        Thread t2 = new Thread(tt,"窗口二");
        Thread t3 = new Thread(tt,"窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
