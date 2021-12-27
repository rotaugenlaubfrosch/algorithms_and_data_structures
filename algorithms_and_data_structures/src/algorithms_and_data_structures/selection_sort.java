package algorithms_and_data_structures;

public class selection_sort {

	public static void main(String[] args) {
		int[] toSort = { 5, 6, 3, 9, 1, 4, 7, 0, 2, 8 };

		// selection sort
		int storage;
		int index_max_value = 0;
		for(int i = toSort.length - 1; i >= 0; i--) {
			for(int j = 0; j <= i; j++) {
				if(j == 0) {
					index_max_value = 0;
				}
				if(toSort[j] > toSort[index_max_value]) {
					index_max_value = j;
				}
			}
			storage = toSort[i];
			toSort[i] = toSort[index_max_value];
			toSort[index_max_value] = storage;
		}
		
		// time complexity: O(n^2)
		// space complexity: O(1)
		
		for (int i = 0; i < toSort.length; i++) {
			System.out.println(toSort[i]);
		}
	}
}
