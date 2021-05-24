package demo05;

/**
 * @author 王艺博
 * @date 2021/5/23 14:54
 */
/*
    方式二：实现Runnable接口
        1 定义一个类MyRunnable实现Runnable接口
        2 在MyRunnable类中重写run方法
        3 创建MyRunnable对象
        4 创建Thread类的对象，把MyRunnable对象作为构造方法的参数
        5 启动线程
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        // 创建MyRunnable对象
        MyRunnable my = new MyRunnable();
        // 创建Thread类的对象，把MyRunnable对象作为构造方法的参数
        // Thread(Runnable target)
//        Thread td = new Thread(my);
//        Thread td2 = new Thread(my);
        //Thread(Runnable target,String name)
        Thread td = new Thread(my,"高铁");
        Thread td2 = new Thread(my,"飞机");
        td.start();
        td2.start();

    }
}
