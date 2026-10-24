# Heapsort

Heapsort in two versions. `heapSortWithPriorityQueue` adds every element to a priority queue and takes them back out in order, using $O(n)$ extra space. `heapSort` builds a max-heap inside the array and empties it into the back of the array, sorting in place. A JUnit suite runs the same scenarios against both, then checks the in-place version's helpers by reading them through reflection.

## Prerequisites

- JDK 17+
- The JUnit jar is already vendored in `lib/`; there is nothing to download.

## Repository layout

```plaintext
code/
  README.md
  .gitignore
  lib/
    junit-platform-console-standalone-6.1.0.jar
  src/
    main/
      sorts/
        HeapSort.java                   # the two heapsorts and their helpers
        Main.java                       # demo entry point (the chapter's example array)
      priorityqueue/
        PriorityQueue.java              # the PriorityQueue ADT
        ArrayHeap.java                  # the array binary heap from the binary heap chapter
    test/
      sorts/
        HeapSortTest.java               # abstract: the heapsort scenarios
        HeapSortWithPriorityQueueTest.java  # runs them against the priority queue version
        HeapSortInPlaceTest.java        # runs them against the in-place version
        HeapSortHelpersTest.java        # buildHeap, sink, and sortdown, through reflection
  scripts/
    run.sh                              # compile and run the demo (sorts.Main)
    test.sh                             # compile and run the JUnit tests
```

## How to compile and run

- `scripts/test.sh` — compiles everything and runs the full JUnit suite.
- `scripts/test.sh sorts.HeapSortInPlaceTest` — compiles everything and runs only that test class.
- `scripts/run.sh` — compiles everything and runs the `Main` demo.

## What's here

- `sorts.HeapSort` — `heapSortWithPriorityQueue` and `heapSort`. The in-place version uses private helpers: `buildHeap` sinks every internal node from the last one back to the root, `sortdown` swaps the root to the back of the heap and sinks the new root, and `sink` takes the size of the heap so it never touches the sorted tail.
- `sorts.Main` — sorts the chapter's example array, `[5, 3, 8, 1, 9, 2]`, both ways.
- `priorityqueue.PriorityQueue<T>` and `priorityqueue.ArrayHeap<T>` — the PriorityQueue ADT and the array binary heap from the binary heap chapter, copied so this code compiles and runs on its own.
- `sorts.HeapSortTest` and its two subclasses — the sort scenarios, run once per version.
- `sorts.HeapSortHelpersTest` — checks `buildHeap`, `sink`, and `sortdown` by calling them through reflection.
