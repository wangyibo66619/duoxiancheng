package demo01;

/**
 * @author 王艺博
 * @date 2021/5/23 11:15
 */
/*
    方式： 继承Thread类
        1 定义一个MyThread类继承Thread类
        2 在MyThread类中重写run（）方法
        3 创建MyThread类对象
        4 启动线程

 */
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread mtd = new MyThread();
        MyThread mtd2 = new MyThread();

//        mtd.run();
//        mtd2.run();
        // void start() 导致此线程开始执行; Java虚拟机调用此线程的run方法。
        mtd.start();
        mtd2.start();
    }
}
