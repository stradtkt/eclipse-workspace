package arrayvarargs;

import java.util.Arrays;

public class ArrayVarargs {

	public static void main(String[] args) {
		int[] list = multiply(2, 3, 4, 5);
		System.out.println(Arrays.toString(list));
		int[] list2 = multiply(2, 10, 20, 30);
		System.out.println(Arrays.toString(list2));
		int[] list3 = multiply(2, 15, 30, 45);
		System.out.println(Arrays.toString(list3));
	}
	
	private static int[] multiply(int multiplier, int...elements) {
		int[] result = new int[elements.length];
		for(int i = 0; i < elements.length; ++i) {
			result[i] = multiplier * elements[i];
		}
		return result;
	}

}
