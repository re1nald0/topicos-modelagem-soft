package arraysorting;

public class run {
	public static void main(String[] args) {
		int[] numbers = {2, 8, 1, 4, 7, 5};
		QuickSort quickSort = new QuickSort();
		MergeSort mergeSort = new MergeSort();
		HeapSort heapSort = new HeapSort();
		
		//---------QUICK SORT---------
		Sort sorter = new Sort(numbers, quickSort);
		System.out.println("Antes - QUICK SORT");
		sorter.printNumbers();
		
		sorter.sort();
		System.out.println("Depois - QUICK SORT");
		sorter.printNumbers();

		//---------MERGE SORT---------
		Sort sorter = new Sort(numbers, mergeSort);
		System.out.println("Antes - MERGE SORT");
		sorter.printNumbers();
		
		sorter.sort();
		System.out.println("Depois - MERGE SORT");
		sorter.printNumbers();

		//---------HEAP SORT---------
		Sort sorter = new Sort(numbers, heapSort);
		System.out.println("Antes - HEAP SORT");
		sorter.printNumbers();
		
		sorter.sort();
		System.out.println("Depois - HEAP SORT");
		sorter.printNumbers();
	}
}
