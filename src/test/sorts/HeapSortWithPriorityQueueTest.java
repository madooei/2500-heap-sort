package sorts;

/** Runs the heapsort scenarios against the version that uses a priority queue. */
public class HeapSortWithPriorityQueueTest extends HeapSortTest {

  @Override
  protected void heapSort(int[] arr) {
    HeapSort.heapSortWithPriorityQueue(arr);
  }
}
