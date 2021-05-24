package demo07;

import demo07.SellTicket;

/**
 * @author 王艺博
 * @date 2021/5/23 15:29
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        // 创建SellTicket对象
        SellTicket st = new SellTicket();
        // 创建三个Thread对象，把SellTicket对象作为构造方法的参数，并跟对应的名字
        Thread t1 = new Thread(st,"窗口一");
        Thread t2 = new Thread(st,"窗口二");
        Thread t3 = new Thread(st,"窗口三");
        // 启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
