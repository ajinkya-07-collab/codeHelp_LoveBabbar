package Collection.List_Interface;

import java.util.Iterator;
import java.util.Vector;

public class VectorClass {

    public static void main(String[] args) {

        Vector<Integer> vc = new Vector<>();

        // add
        vc.add(10);
        vc.add(20);
        vc.add(30);
        vc.add(40);
        System.out.println(vc);

        // add(index,element)
        vc.add(0, 111);
        System.out.println(vc);

        // addAll
        Vector<Integer> vc1 = new Vector<>();
        vc1.add(100);
        vc1.add(200);
        vc.addAll(vc1);
        System.out.println(vc);

        // clear //removeAll
        vc.removeAll(vc1);
        System.out.println(vc);
        vc1.clear();
        System.out.println(vc1);

        // get(index)
        System.out.println(vc.get(0));

        // iterator
        Iterator<Integer> itr = vc.iterator();
        while (itr.hasNext()) {
            System.out.println("Elemnet : " + itr.next());
        }

        // size
        System.out.println(vc.size());

        // toArray
        Object[] arr = vc.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

    }

}
