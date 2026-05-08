package Collection.Queue_Interface;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {

    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>();

        // default behaviour -> Integers -> lessValue -> Highest
        // Prioritiy(whilefetching(removing))

        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq); // [40,30,10,20]
        System.out.println(pq.poll()); // 10
        System.out.println(pq); // [40,30,20]
        System.out.println(pq.poll()); // 20
        System.out.println(pq);// [40,30]
        System.out.println(pq.poll()); // 30

        Queue<Integer> pq1 = new PriorityQueue<>((a, b) -> b - a);
        // maxheap -> Integers -> high value -> high priority
        pq1.offer(40);
        pq1.offer(30);
        pq1.offer(10);
        pq1.offer(20);
        System.out.println(pq1);// [40,30,10,20]
        System.out.println(pq1.poll()); // 40
        System.out.println(pq1);// [30,10,20]
        System.out.println(pq1.poll());// 30
        System.out.println(pq1);// [10,20]
        System.out.println(pq1.poll()); // 20

    }

}
