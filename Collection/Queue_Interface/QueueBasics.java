package Collection.Queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();

        // add() => Inserts specified element into queue. If task is successful, add()
        // returns true, if not throws an exception.
        // use offer() as add() throws exception

        // offer() => Inserts specified element into the queue. If task is successful,
        // offer() returns true, if not it returns false.
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);

        // element() – Returns the head of the queue. Throws an exception if the queue
        // is empty.
        // use peek() as element() throws exception.

        // peek() – Returns the head of the queue. Returns null if the queue is empty.
        System.out.println(q.peek());

        // remove() – Returns and removes the head of the queue. Throws an exception if
        // the queue is empty.
        // use poll() as remove() throws exception

        // poll() – Returns and removes the head of the queue. Returns null if the queue
        // is empty.
        /// q.poll();
        System.out.println(q.poll());
        System.out.println(q);
    }

}
