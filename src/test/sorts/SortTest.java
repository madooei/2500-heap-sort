package sorts;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The scenarios for heapsort. A concrete subclass supplies sort() to pick
 * the version under test.
 */
public abstract class SortTest {

  // Calls the version under test.
  protected abstract void sort(int[] arr);

  @Test
  public void emptyArrayStaysEmpty() {
    int[] arr = {};
    sort(arr);
    assertElements(new int[] {}, arr);
  }

  @Test
  public void singleElementStaysPut() {
    int[] arr = {1};
    sort(arr);
    assertElements(new int[] {1}, arr);
  }

  @Test
  public void alreadySortedArrayIsUnchanged() {
    int[] arr = {1, 2, 3};
    sort(arr);
    assertElements(new int[] {1, 2, 3}, arr);
  }

  @Test
  public void reverseSortedArrayGetsSorted() {
    int[] arr = {3, 2, 1};
    sort(arr);
    assertElements(new int[] {1, 2, 3}, arr);
  }

  @Test
  public void allDuplicatesAreUnchanged() {
    int[] arr = {4, 4, 4};
    sort(arr);
    assertElements(new int[] {4, 4, 4}, arr);
  }

  @Test
  public void unsortedArrayGetsSorted() {
    int[] arr = {5, 1, 4, 2};
    sort(arr);
    assertElements(new int[] {1, 2, 4, 5}, arr);
  }

  @Test
  public void duplicatesAmongOtherValuesGetSorted() {
    int[] arr = {3, 1, 3, 2, 1};
    sort(arr);
    assertElements(new int[] {1, 1, 2, 3, 3}, arr);
  }

  @Test
  public void negativesSortBeforePositives() {
    int[] arr = {-3, 1, -7, 4};
    sort(arr);
    assertElements(new int[] {-7, -3, 1, 4}, arr);
  }

  @Test
  public void powerOfTwoLengthGetsSorted() {
    int[] arr = {5, 3, 8, 6, 2, 7, 1, 4};
    sort(arr);
    assertElements(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, arr);
  }

  @Test
  public void nonPowerOfTwoLengthGetsSorted() {
    int[] arr = {6, 5, 2, 0, 9, 1, 3};
    sort(arr);
    assertElements(new int[] {0, 1, 2, 3, 5, 6, 9}, arr);
  }

  // Asserts that actual holds exactly the expected elements, in order.
  protected static void assertElements(int[] expected, int[] actual) {
    assertEquals(expected.length, actual.length);
    for (int i = 0; i < expected.length; i++) {
      assertEquals(expected[i], actual[i]);
    }
  }
}
