package sorts;

/** Runs the heapsort scenarios against the version that uses a priority queue. */
public class HeapSortWithPriorityQueueTest extends SortTest {

  @Override
  protected void sort(int[] arr) {
    HeapSortWithPriorityQueue.sort(arr);
  }
}
