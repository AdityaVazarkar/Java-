package collection;

import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection values = new ArrayList();
        values.add(5);
        values.add("str1");
        values.add("6");
        values.add(5.8);
        values.add(9);

        //first Way
        Iterator i = values.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        //Second way
        for(Object o : values){
            System.out.println(o);
        }
        //Third way
        values.forEach(System.out::println);
    }
}
