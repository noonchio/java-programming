package misc;

import java.util.HashSet;
import java.util.Iterator;

public class HashBrowns {
    public static void main(String[] args) {

//        HashSet<String> h = new HashSet<String>();
//        h.add("lemur");
//        h.add("orangutan");
//        h.add("spider monkey");
//        h.add("silver-back gorilla");
//
//        h.remove("orangutan");
////        h.clear removes everything
////        h.size
//        System.out.println(h.contains("spider monkey"));
//
//        System.out.println(h.size());

        HashSet<Integer> hashbrowns = new HashSet<Integer>();

        hashbrowns.add(13);
        hashbrowns.add(24);
        hashbrowns.add(5);

        Iterator<Integer> it = hashbrowns.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Object [] h = hashbrowns.toArray();
        System.out.println();
    }
}

// tutorial bhy Alex Lee @ https://www.youtube.com/watch?v=PeFyhRr42ac