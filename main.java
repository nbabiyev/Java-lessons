package bucky.collection;

import java.util.*;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

public class main {
    public static void main(String[] args) {

// add array items to list

        String[] words = {"xiyar", "pomidor", "goyerti"};
        List<String> list = new ArrayList<String>();
        for (String x : words)
            list.add(x);


        String[] wordss = {"badimxab", "alma", "xiyar"};
        List<String> list1 = new ArrayList<String>();
        for (String y : wordss)
            list1.add(y);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
            System.out.printf("%s ", list1.get(i));
        }
        editlist(list, list1);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
    public static void editlist(Collection<String > l1, Collection <String> l2){
        Iterator<String> it =l1.iterator();
        while (it.hasNext()){
            if (l2.contains(it.next()))
                it.remove();
        }

    }


}

