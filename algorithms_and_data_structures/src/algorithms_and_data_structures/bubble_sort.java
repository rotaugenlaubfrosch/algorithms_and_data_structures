package algorithms_and_data_structures;

public class bubble_sort {

	public static void main(String[] args) {
		int[] toSort = { 5, 6, 3, 9, 1, 4, 7, 0, 2, 8 };
		
		// bubble sort implementation
		int storage;
		for(int i = toSort.length - 1; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				if(toSort[j] > toSort[j+1]) {
					storage = toSort[j+1];
					toSort[j+1] = toSort[j];
					toSort[j] = storage;
				}
			}
		}
		
		// time complexity: O(n^2)
		// space complexity: O(n)
		
		for(int i = 0; i < toSort.length; i++) {
			System.out.println(toSort[i]);
		}
		
	}

}
