package Collection.Set_Interface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetBasics {

    public static void main(String[] args) {

        Set<Integer> st = new HashSet<>();
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);

        System.out.println(st); // ignores duplicates // Not in order(Randomposition) [20,10,30]

        Iterator<Integer> it = st.iterator();

        while (it.hasNext()) {
            System.out.println("Element : " + it.next());
        }

        System.out.println("+++++++++++++");

        Set<Integer> st1 = new HashSet<>();
        Set<Integer> st2 = new HashSet<>();

        st1.add(1);
        st1.add(2);
        st1.add(3);
        st1.add(4);

        st2.add(3);
        st2.add(4);
        st2.add(5);
        st2.add(6);

        System.out.println(st1);
        st1.retainAll(st2);
        System.out.println(st1); // [3,4]
        System.out.println(st2); // [3, 4, 5, 6]
        System.out.println(st1.containsAll(st2));// false
        System.out.println(st2.containsAll(st2));// true

        // HashSet<Student> hs = new HashSet<>();
        // Student s1 = new Student(1, "Ajinkya");
        // Student s2 = new Student(1, "Ajinkya");
        // Student s3 = new Student(1, "Ajinkya");

        // hs.add(s1);
        // hs.add(s2);
        // hs.add(s3);

        // System.out.println(hs);

    }

}
