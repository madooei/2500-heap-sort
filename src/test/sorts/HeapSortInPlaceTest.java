package sorts;

/** Runs the heapsort scenarios against the in-place version. */
public class HeapSortInPlaceTest extends HeapSortTest {

  @Override
  protected void heapSort(int[] arr) {
    HeapSort.heapSort(arr);
  }
}
