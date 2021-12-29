package algorithms_and_data_structures;

public class heap_sort extends sort {

	public static void main(String[] args) {
		int[] toSort = getintegers(10);
		int n = toSort.length;
		// make array a max heap
		for(int i = n / 2; i > 0; i--) {
			restore_heap_condition(toSort, i, n);
		}
		print("", toSort);
		
		// heap sort
		for(int i = n; i >= 2 ; i--) {
			int storage = toSort[i-1];
			toSort[i-1] = toSort[0];
			toSort[0] = storage;
			restore_heap_condition(toSort, 1, i-1);
		}

		print("Sorted array:", toSort);
	}

	public static void restore_heap_condition(int[] toSort, int index, int size) {
		// as long as toSort[index] has left child (i must not be smaller than 1)
		while(index*2 <= size) {
			// get index of left child
			int j = 2 * index;
			// check if toSort[index] has right child
			if(j + 1 <= size) {
				// identify largest child
				if(toSort[j-1] < toSort[j]) {
					j += 1;
				}
			}
			// in case largest child is not larger than toSort[index], abort
			if(toSort[index-1] >= toSort[j-1]) {
				return;
			}
			// swap toSort[index] with toSort[j]
			int storage = toSort[j-1];
			toSort[j-1] = toSort[index-1];
			toSort[index-1] = storage;
			// call restore_heap_condition on swapped node
			restore_heap_condition(toSort, j, size);
		}
	}
}
