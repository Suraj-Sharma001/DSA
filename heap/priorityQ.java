package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class priorityQ {
    public static void main(String[] args) {
        // min heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(40);
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(20);
        minHeap.add(50);
        System.out.println(minHeap);
        System.out.println(minHeap.poll());  // root remove
        System.out.println(minHeap.peek());  // root return

        // max heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(40);
        maxHeap.add(10);
        maxHeap.add(30);
        maxHeap.add(20);
        maxHeap.add(50);
        System.out.println(maxHeap);
        System.out.println(maxHeap.poll());  // root remove
        System.out.println(maxHeap.peek());  // root return
    }
}
