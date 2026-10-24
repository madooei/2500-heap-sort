package sorts;

import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Tests the private helpers of the in-place heapsort, through reflection. */
public class HeapSortHelpersTest {

  @Test
  public void buildHeapMakesTheChapterExampleAMaxHeap() {
    int[] arr = {5, 3, 8, 1, 9, 2};
    call("buildHeap", arr);
    assertElements(new int[] {9, 5, 8, 1, 3, 2}, arr);
  }

  @Test
  public void buildHeapLeavesAMaxHeapUnchanged() {
    int[] arr = {9, 5, 8, 1, 3, 2};
    call("buildHeap", arr);
    assertElements(new int[] {9, 5, 8, 1, 3, 2}, arr);
  }

  @Test
  public void sinkMovesTheRootBelowItsLargerChild() {
    int[] arr = {2, 5, 8, 1, 3, 9};
    callSink(arr, 0, 5);
    assertElements(new int[] {8, 5, 2, 1, 3, 9}, arr);
  }

  @Test
  public void sinkLeavesTheSlotsPastSizeAlone() {
    int[] arr = {2, 5, 8, 1, 3, 9};
    callSink(arr, 0, 5);
    assertEquals(9, arr[5]);
  }

  @Test
  public void sortdownSortsAMaxHeap() {
    int[] arr = {9, 5, 8, 1, 3, 2};
    call("sortdown", arr);
    assertElements(new int[] {1, 2, 3, 5, 8, 9}, arr);
  }

  // Calls the private static method name(int[]) of HeapSort on arr.
  private static void call(String name, int[] arr) {
    try {
      Method method = HeapSort.class.getDeclaredMethod(name, int[].class);
      method.setAccessible(true);
      method.invoke(null, arr);
    } catch (ReflectiveOperationException e) {
      throw new RuntimeException(e);
    }
  }

  // Calls the private static method sink(int[], int, int) of HeapSort.
  private static void callSink(int[] arr, int i, int size) {
    try {
      Method method = HeapSort.class.getDeclaredMethod("sink", int[].class, int.class, int.class);
      method.setAccessible(true);
      method.invoke(null, arr, i, size);
    } catch (ReflectiveOperationException e) {
      throw new RuntimeException(e);
    }
  }

  private static void assertElements(int[] expected, int[] actual) {
    assertEquals(expected.length, actual.length);
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
}
