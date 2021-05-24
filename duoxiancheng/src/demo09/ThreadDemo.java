package demo09;

import java.util.*;

/**
 * @author 王艺博
 * @date 2021/5/23 17:51
 */
/*
    线程安全的类：
        StringBuffer
        Vector
        Hashable

 */
public class ThreadDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        Vector<Object> v1 = new Vector<>();
        ArrayList<Object> list = new ArrayList<>();

        Hashtable<Object, Object> ht = new Hashtable<>();
        HashMap<Object, Object> oh = new HashMap<>();

        //static <T> List<T> synchronizedList(List<T> list) 返回由指定列表支持的同步（线程安全）列表。
        List<Object> objects = Collections.synchronizedList(new ArrayList<>());
    }
}
