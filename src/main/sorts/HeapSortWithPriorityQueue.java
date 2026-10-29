package sorts;

import priorityqueue.ArrayHeap;
import priorityqueue.PriorityQueue;

/** Heapsort, in the version that uses a priority queue. */
public final class HeapSortWithPriorityQueue {

  private HeapSortWithPriorityQueue() {
    // This class should not be instantiated!
  }

  // Sorts arr in ascending order. Assumes arr is not null.
  public static void sort(int[] arr) {
    PriorityQueue<Integer> pq = new ArrayHeap<>();
    for (int i = 0; i < arr.length; i++) {
      pq.add(arr[i]);
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i] = pq.peek();
      pq.remove();
    }
  }
}
