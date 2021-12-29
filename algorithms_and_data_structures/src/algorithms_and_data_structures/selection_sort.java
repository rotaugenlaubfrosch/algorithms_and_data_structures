package algorithms_and_data_structures;

public class selection_sort extends sort {

	public static void main(String[] args) {
		int[] toSort = getintegers(10);

		// selection sort
		int storage;
		int index_max_value = 0;
		for (int i = toSort.length - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					index_max_value = 0;
				}
				if (toSort[j] > toSort[index_max_value]) {
					index_max_value = j;
				}
			}
			storage = toSort[i];
			toSort[i] = toSort[index_max_value];
			toSort[index_max_value] = storage;
		}

		// time complexity: O(n^2)
		// space complexity: O(1)

		print("Sorted array:", toSort);
	}
}
