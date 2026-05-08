package Collection.List_Interface;

import java.util.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LInkedList {

    public static void main(String[] args) {

        // List<Integer> list2 = new ArrayList<>();

        LinkedList<Integer> list = new LinkedList<>();

        // add
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // list.add(0,100); // [100,10,20,30.40]
        System.out.println(list);

        // remove
        list.remove(0);
        System.out.println(list);

        // addAll
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(101);
        list2.add(102);

        list.addAll(list2);
        System.out.println(list);

        // removeAll
        list.removeAll(list2);
        System.out.println(list);

        // size
        System.out.println(list.size());

        // clear
        System.out.println("Printing list2 :" + list2);
        list2.clear();
        System.out.println(list2.size());

        // I want to traverse list using iterator
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println("Element : " + itr.next());
        }

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);

        // get
        System.out.println(list3.get(0)); // 11

        // set
        System.out.println("Before set method() : " + list3); // [11,12,13]
        list3.set(0, 100);
        System.out.println("after set method() : " + list3); // [100,12,13]

        // toArray
        Object[] arr = list3.toArray();
        for (Object obj : arr) {
            System.out.println(obj);
        }

        // contains
        System.out.println(list3.contains(100)); // true

        // sort
        list.add(12);
        list.add(6);
        System.out.println("Printing list before sorting : " + list);
        Collections.sort(list);
        System.out.println("Printing list after sorting : " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Printing list Descending sorting : " + list);

        LinkedList<Integer> marks = new LinkedList<>();
        // isEmpty => checks if list is empty or not
        System.out.println(marks.isEmpty());

        // indexOf() => search element in list and returns index of element
        System.out.println(list);
        System.out.println(list.indexOf(12));

    }

}
