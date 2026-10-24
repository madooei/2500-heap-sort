package sorts;

import priorityqueue.ArrayHeap;
import priorityqueue.PriorityQueue;

/** Heapsort, in a version that uses a priority queue and an in-place version. */
public final class HeapSort {

  private HeapSort() {
    // This class should not be instantiated!
  }

  // Sorts arr in ascending order, using a priority queue that holds a copy of
  // every element. Assumes arr is not null.
  public static void heapSortWithPriorityQueue(int[] arr) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Sorts arr in ascending order, in place. Assumes arr is not null.
  public static void heapSort(int[] arr) {
    buildHeap(arr);   // rearrange the array into a max-heap
    sortdown(arr);    // empty the heap, laying the values down in order
  }

  // Rearranges arr into a max-heap.
  private static void buildHeap(int[] arr) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Assumes arr is a max-heap. Rearranges it into ascending order.
  private static void sortdown(int[] arr) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // Moves arr[i] down until no child is larger than it. Only the first size
  // slots of arr belong to the heap.
  private static void sink(int[] arr, int i, int size) {
    // TODO: Implement me
    throw new UnsupportedOperationException("TODO: Implement me");
  }

  // The left child of the node at index i.
  private static int leftChild(int i) {
    return 2 * i + 1;
  }

  // The right child of the node at index i.
  private static int rightChild(int i) {
    return 2 * i + 2;
  }

  // Exchanges arr[i] and arr[j].
  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
