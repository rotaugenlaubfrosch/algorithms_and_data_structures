package algorithms_and_data_structures;

import java.util.Arrays;

public class sort {
	// creates shuffled integer array of length n
	static int[] getintegers(int n) {
		int[] integers = new int[n];
		int counter = 0;
		for(int i = 0; i < n; i++) {
			integers[i] = counter;
			counter++;
		}
		for(int i = 0; i < n; i++) {
			int random = (int) (Math.random()*n);
			int storage = integers[i];
			integers[i] = integers[random];
			integers[random] = storage;
		}
		print("Generated array:", integers);
		return integers;
	}
	
	// prints array
	static void print(String msg, int[] array) {
		System.out.println(msg + " " + Arrays.toString(array));
	}
}
