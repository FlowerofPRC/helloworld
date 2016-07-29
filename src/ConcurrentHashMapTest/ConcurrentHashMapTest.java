package ConcurrentHashMapTest;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2016/7/22.
 */

public class ConcurrentHashMapTest {

    private static ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<Integer, Integer>();
    public static void main(String[] args) {
        new Thread("Thread1"){
            @Override
            public void run() {
                map.put(3, 33);
            }
        };

        new Thread("Thread2"){
            @Override
            public void run() {
                map.put(4, 44);
            }
        };

        new Thread("Thread3"){
            @Override
            public void run() {
                map.put(7, 77);
            }
        };
        System.out.println(map);
    }
}
