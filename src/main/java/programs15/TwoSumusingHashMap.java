package programs15;

import java.util.HashMap;
import java.util.Map;

public class TwoSumusingHashMap {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 1, 6, 7, 8, 9, 5 };
		int target = 7;
		int[] result = pairSum(arr, target);
		if (result.length == 2) {
			System.out.println("The Indices are:" +result[0] + "&" + result[1]);
		} else {
			System.out.println("No solution found!");
		}
	}

	private static int[] pairSum(int[] arr, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int diff = target - arr[i];
			if (map.containsKey(diff)) {
				return new int[] { map.get(diff), i };
			}
			map.put(arr[i], i);
		}
		return new int[] {};
	}
}