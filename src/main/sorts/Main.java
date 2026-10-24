package sorts;

/** A demo of the two heapsorts on the chapter's example array. */
public final class Main {

  private Main() {
    // This class should not be instantiated!
  }

  public static void main(String[] args) {
    int[] first = {5, 3, 8, 1, 9, 2};
    HeapSort.heapSortWithPriorityQueue(first);
    System.out.println("with a priority queue: " + toText(first));

    int[] second = {5, 3, 8, 1, 9, 2};
    HeapSort.heapSort(second);
    System.out.println("in place:              " + toText(second));
  }

  // The elements of arr, separated by spaces.
  private static String toText(int[] arr) {
    StringBuilder text = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      if (i > 0) {
        text.append(" ");
      }
      text.append(arr[i]);
    }
    return text.toString();
  }
}
