package demo;

import java.util.Arrays;
import sorts.HeapSortWithPriorityQueue;

/** A demo of HeapSortWithPriorityQueue on the chapter's example array. */
public final class HeapSortWithPriorityQueueDemo {

  private HeapSortWithPriorityQueueDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] arr = {5, 3, 8, 1, 9, 2};
    System.out.println("before: " + Arrays.toString(arr));

    // Expect [1, 2, 3, 5, 8, 9].
    HeapSortWithPriorityQueue.sort(arr);
    System.out.println("after:  " + Arrays.toString(arr));
  }
}
