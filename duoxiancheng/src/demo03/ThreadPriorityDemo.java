package demo03;

/**
 * @author 王艺博
 * @date 2021/5/23 13:46
 */
/*
    Thread中获取优先级和设置优先级的方法：
        int getPriority() 返回此线程的优先级。
        void setPriority(int newPriority) 更改此线程的优先级。
 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tpy1 = new ThreadPriority();
        ThreadPriority tpy2 = new ThreadPriority();
        ThreadPriority tpy3 = new ThreadPriority();

        tpy1.setName("高铁");
        tpy2.setName("飞机");
        tpy3.setName("汽车");

//        int getPriority() 返回此线程的优先级。
//        System.out.println(tpy1.getPriority());
//        System.out.println(tpy2.getPriority());
//        System.out.println(tpy3.getPriority());

//        void setPriority(int newPriority) 更改此线程的优先级。
//        tpy1.setPriority(1000);  // IllegalArgumentException
//        System.out.println(Thread.MAX_PRIORITY);// 10     最高优先级
//        System.out.println(Thread.MIN_PRIORITY);// 1      最低优先级
//        System.out.println(Thread.NORM_PRIORITY);// 5     默认优先级

        // 设置优先级
        tpy1.setPriority(5);
        tpy2.setPriority(10);
        tpy3.setPriority(1);

        tpy1.start();
        tpy2.start();
        tpy3.start();

        // 线程优先级高仅仅表示线程获取的CPU时间片几率高
    }
}
