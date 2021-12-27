package algorithms_and_data_structures;

public class insertion_sort {

	public static void main(String[] args) {
		int[] toSort = { 5, 6, 3, 9, 1, 4, 7, 0, 2, 8 };

		// insertion sort
		int key, j;
		for (int i = 1; i < toSort.length; ++i) {
			key = toSort[i];
			j = i - 1;
			while (j >= 0 && toSort[j] > key) {
				toSort[j + 1] = toSort[j];
				j--;
			}
			toSort[j + 1] = key;
		}

		// time complexity: O(n^2)
		// space complexity: O(1)

		for (int i = 0; i < toSort.length; i++) {
			System.out.println(toSort[i]);
		}
	}
}
