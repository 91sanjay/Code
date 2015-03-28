import java.util.ArrayList;
import java.util.Scanner;

/* The first line of the input contains the number of elements to be read. The second line contains the
 * input separated by spaces. All integers occur in pairs expcept for one. Find the Lonely Integer */

public class Solution {
	static int lonelyinteger(int[] a) {
		/*
		 * The list found keeps track of all the integers that have been visited
		 * in the array. If the integer was previously found then it is removed.
		 * Else it is added to the list. If there was a lonely integer then it
		 * will be the only element in the array and can be returned as the
		 * answer
		 */
		ArrayList<Integer> found = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (found.contains(a[i]))
				found.remove(found.indexOf(a[i]));
			else
				found.add(a[i]);
		}

		if (found.size() > 0)
			return found.get(0);
		else
			return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Please enter the size of the input array followed by the elements on the next line.");
			int res;
			int size = Integer.parseInt(in.nextLine());
			int[] inputArray = new int[size];
			int item;
			String next = in.nextLine();
			String[] split = next.split(" ");

			for (int _a_i = 0; _a_i < size; _a_i++) {
				item = Integer.parseInt(split[_a_i]);
				inputArray[_a_i] = item;
			}

			res = lonelyinteger(inputArray);
			System.out.println("The Lonely Integer is "+res);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} finally {
			in.close();
		}

	}
}