package Collection.Set_Interface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetBasics {

    public static void main(String[] args) {

        Set<Integer> st = new LinkedHashSet<>();
        st.add(30);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(20);

        System.out.println(st); // ignores duplicates // order Preserved [30,10,20]
    }

}
