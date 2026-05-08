package Collection.Set_Interface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetBasics {

    public static void main(String[] args) {

        Set<Integer> st = new TreeSet<>();
        st.add(30);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(40);
        st.add(30);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);

        System.out.println(st); // ignores duplicates // sorted order

    }

}
