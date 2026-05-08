package Collection.Queue_Interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackQueue_ArrayDeque {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        stack.poll();
        System.out.println(stack);
    }

}
