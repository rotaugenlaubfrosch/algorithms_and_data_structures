package algorithms_and_data_structures;

public class bubble_sort extends sort {

	public static void main(String[] args) {
		int[] toSort = getintegers(10);

		// bubble sort implementation
		int storage;
		for (int i = toSort.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (toSort[j] > toSort[j + 1]) {
					storage = toSort[j + 1];
					toSort[j + 1] = toSort[j];
					toSort[j] = storage;
				}
			}
		}

		// time complexity: O(n^2)
		// space complexity: O(n)

		print("Sorted array:", toSort);
	}
}
