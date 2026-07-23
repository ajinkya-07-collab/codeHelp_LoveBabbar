package Collection.List_Interface;

import java.util.ArrayDeque;
import java.util.Deque;
//import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {

        // >>What’s wrong with Stack?
        // It’s a legacy class (Stack) that extends Vector
        // Synchronized by default → unnecessary locking → slower
        // Older API style; not recommended in modern Java
        // >>Why ArrayDeque is better
        // 1) Faster (no unnecessary synchronization)
        // No built-in locks → better performance
        // 2) More flexible (Deque = double-ended)
        // Works as stack (LIFO) and queue (FIFO)
        // 3) Cleaner modern API
        // Part of Deque → preferred in interviews & production

        Deque<Integer> stk = new ArrayDeque<>();
        stk.add(10);
        stk.add(20);
        stk.add(30);
        stk.add(40);
        stk.add(50);
        System.out.println(stk);

        // push
        stk.push(101);
        System.out.println(stk);

        // pop
        stk.pop();
        System.out.println(stk);

        // peek
        System.out.println(stk.peek());

        // search
        // System.out.println(stk.search(30)); // positon from top 50 > 40 > 30 > 20 >
        // 10

        // isEmpty
        System.out.println(stk.isEmpty());
    }

}
