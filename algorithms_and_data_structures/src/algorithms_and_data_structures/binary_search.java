package algorithms_and_data_structures;

import java.util.Arrays;

public class binary_search extends sort {

	public static void main(String[] args) {
		// get sorted int[10] array
		int[] random = getintegers(10);
		Arrays.sort(random);
		// int that needs to be found
		int to_find = (int) (Math.random() * 10);
		System.out.println(to_find + " is at index " + binary(random, 0, random.length - 1, to_find));
	}

	// returns index of item "to_find". If it cannot be found -1 gets returned
	public static int binary(int[] array, int low, int high, int to_find) {
		if (high >= low) {
			int mid = low + (high - low) / 2;
			if (array[mid] == to_find) {
				return mid;
			}
			if (array[mid] > to_find) {
				return binary(array, low, mid - 1, to_find);
			}
			return binary(array, mid + 1, high, to_find);
		}
		return -1;
	}

}
