package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import main.java.Item;
import main.java.SortAlgos;


public class AlgoTest {
	
	@Rule
    public ExpectedException thrown = ExpectedException.none();
	
	
	/**
	 * BubbleSort NODE & EDGE COVERAGE
	 */
	@Test
	public void testBubbleSort() {
		// Initialize data set
		Item[] SortBubble = {new Item(1), new Item(3), new Item(2), 
				new Item(5), new Item(4), new Item(6), new Item(7), 
				new Item(9), new Item(8), new Item(10)};
		Item[] SortBubbleSorted = {new Item(1), new Item(2), new Item(3), 
				new Item(4), new Item(5), new Item(6), new Item(7), 
				new Item(8), new Item(9), new Item(10)};
		// Calling function
		SortAlgos.bubbleSort(SortBubble);
		for (int j = 0; j < SortBubble.length; j++) {
			assertEquals("Bubble Sort Element comparison for node and edge coverage",
					SortBubble[j].key,
					SortBubbleSorted[j].key);
		}
	}
	
	/**
	 * BubbleSort CONDITION COVERAGE
	 */
	@Test
	public void testBubbleSortCondition() {
		// Executing conditional branch check for null vector.
		thrown.expect(NullPointerException.class);
		Item[] NullVectorMerge = null;
		SortAlgos.bubbleSort(NullVectorMerge);
	}
	
	/**
	 * SelecitonSort NODE & EDGE COVERAGE
	 */
	@Test
	public void testSelectionSort() {
		Item[] SortSelection = {new Item(1), new Item(3), new Item(2), 
				new Item(5), new Item(4), new Item(6), new Item(7), 
				new Item(9), new Item(8), new Item(10)};
		Item[] SortSelectionSorted = {new Item(1), new Item(2), new Item(3), 
				new Item(4), new Item(5), new Item(6), new Item(7), 
				new Item(8), new Item(9), new Item(10)};
		SortAlgos.selectionSort(SortSelection);
		for (int j = 0; j < SortSelection.length; j++) {
			assertEquals("Bubble Sort Element comparison for node and edge coverage",
					SortSelection[j].key,
					SortSelectionSorted[j].key);
		}
	}
	
	/**
	 * SelectionSort CONDITION COVERAGE
	 */
	@Test
	public void testSelectionSortCondition() {
		// Executing conditional branch check for null vector.
		thrown.expect(NullPointerException.class);
		Item[] NullVectorMerge = null;
		SortAlgos.selectionSort(NullVectorMerge);
	}


	/**
	 * InsertionSort NODE & EDGE COVERAGE
	 */
	@Test
	public void testInsertionSort() {
		Item[] SortInsertion = {new Item(1), new Item(3), new Item(2), 
				new Item(5), new Item(4), new Item(6), new Item(7), 
				new Item(9), new Item(8), new Item(10)};
		Item[] SortInsertionSorted = {new Item(1), new Item(2), new Item(3), 
				new Item(4), new Item(5), new Item(6), new Item(7), 
				new Item(8), new Item(9), new Item(10)};
		SortAlgos.insertionSort(SortInsertion);
		for (int j = 0; j < SortInsertion.length; j++) {
			assertEquals("Bubble Sort Element comparison for node and edge coverage",
					SortInsertion[j].key,
					SortInsertionSorted[j].key);
		}
	}
	
	/**
	 * Insertion CONDITION COVERAGE
	 */
	@Test
	public void testInsertionSortCondition() {
		// Executing conditional branch check for null vector.
		thrown.expect(NullPointerException.class);
		Item[] NullVectorMerge = null;
		SortAlgos.insertionSort(NullVectorMerge);
	}
	

	/**
	 * MergeSort NODE & EDGE COVERAGE
	 */
	@Test
	public void testMergeSort() {
		Item[] SortMerge = {new Item(1), new Item(3), new Item(2), 
				new Item(5), new Item(4), new Item(6), new Item(7), 
				new Item(9), new Item(8), new Item(10)};
		Item[] SortMergeSorted = {new Item(1), new Item(2), new Item(3), 
				new Item(4), new Item(5), new Item(6), new Item(7), 
				new Item(8), new Item(9), new Item(10)};
		
		// Calling function, expecting sorted list in return.
		SortAlgos.mergeSort(SortMerge);
		for (int j = 0; j < SortMerge.length; j++) {
			assertEquals("Bubble Sort Element comparison for node and edge coverage",
					SortMerge[j].key,
					SortMergeSorted[j].key);
		}
		
	}
	
	/**
	 * MergeSort CONDITION COVERAGE
	 */
	@Test
	public void testMergeSortCondition() {
		// Executing conditional branch check for null vector.
		thrown.expect(NullPointerException.class);
		Item[] NullVectorMerge = null;
		SortAlgos.mergeSort(NullVectorMerge);
	}
	

	/**
	 * QuickSort NODE & EDGE COVERAGE
	 */
	@Test
	public void testQuickSort() {
		Item[] SortQuick = {new Item(1), new Item(3), new Item(2), 
				new Item(5), new Item(4), new Item(6), new Item(7), 
				new Item(9), new Item(8), new Item(10)};
		Item[] SortQuickSorted = {new Item(1), new Item(2), new Item(3), 
				new Item(4), new Item(5), new Item(6), new Item(7), 
				new Item(8), new Item(9), new Item(10)};
		// Calling function
		SortAlgos.quickSort(SortQuick);
		for (int j = 0; j < SortQuick.length; j++) {
			assertEquals("Bubble Sort Element comparison for node and edge coverage",
					SortQuick[j].key,
					SortQuickSorted[j].key);
		}
	}
	
	/**
	 * QuickSort CONDITION COVERAGE
	 */
	@Test
	public void testQuickSortCondition() {
		// Executing conditional branch check for null vector.
		thrown.expect(NullPointerException.class);
		Item[] NullVectorMerge = null;
		SortAlgos.quickSort(NullVectorMerge);
	}
	
	/**
	 * HeapSort NODE & EDGE COVERAGE
	 */
	@Test
	public void testHeapSort() {
		Item[] SortHeap = {new Item(1), new Item(3), new Item(2), 
				new Item(5), new Item(4), new Item(6), new Item(7), 
				new Item(9), new Item(8), new Item(10)};
		Item[] SortHeapSorted = {new Item(1), new Item(2), new Item(3), 
				new Item(4), new Item(5), new Item(6), new Item(7), 
				new Item(8), new Item(9), new Item(10)};
		// Calling function
		SortAlgos.heapSort(SortHeap);
		for (int j = 0; j < SortHeap.length; j++) {
			assertEquals("Bubble Sort Element comparison for node and edge coverage",
					SortHeap[j].key,
					SortHeapSorted[j].key);
		}
	}
	
	/**
	 * HeapSort CONDITON COVERAGE.
	 */
	@Test
	public void testHeapSortCondition() {
		// Executing conditional branch check for null vector.
		thrown.expect(NullPointerException.class);
		Item[] NullVectorMerge = null;
		SortAlgos.heapSort(NullVectorMerge);
	}

}
