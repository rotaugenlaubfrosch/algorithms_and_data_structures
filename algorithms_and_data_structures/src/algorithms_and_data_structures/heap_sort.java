package algorithms_and_data_structures;

public class heap_sort {

	public static void main(String[] args) {
		int[] toSort = { 5, 6, 3, 9, 1, 4, 7, 0, 2, 8 };

	}

	public static void restore_heap_condition(int[] toSort, int index, int size) {
		// as long as toSort[index] has left child
		while(index*2 <= size) {
			// get index of left child
			int j = 2 * index;
			// check if toSort[index] has right child
			if(j + 1 <= size) {
				// identify largest child
				if(toSort[j] < toSort[j+1]) {
					j += 1;
				}
			}
			// in case largest child is not larger than toSort[index], abort
			if(toSort[index] >= toSort[j]) {
				return;
			}
			// swap toSort[index] with toSort[j]
			int storage = toSort[j];
			toSort[j] = toSort[index];
			toSort[index] = storage;
			// call restore_heap_condition on swapped node
			restore_heap_condition(toSort, j, size);
		}
	}
}
