package demo;

import java.util.Arrays;
import sorts.HeapSort;

/** A demo of HeapSort on the chapter's example array. */
public final class HeapSortDemo {

  private HeapSortDemo() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] arr = {5, 3, 8, 1, 9, 2};
    System.out.println("before: " + Arrays.toString(arr));

    // Expect [1, 2, 3, 5, 8, 9].
    HeapSort.sort(arr);
    System.out.println("after:  " + Arrays.toString(arr));
  }
}
