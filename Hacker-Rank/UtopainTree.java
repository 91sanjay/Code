import java.util.Scanner;

public class UtopainTree {

	public static void main(String[] args) {
		/*
		 * Utopian Tree
		 */

		Scanner sc = new Scanner(System.in);
		try {
			int size = sc.nextInt();
			int[] input = new int[size];
			int i = 0;

			while (sc.hasNext()) {
				input[i] = sc.nextInt();
				i++;
			}

			for (int num : input) {
				int result = getHeight(num);
				System.out.println(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

	public static int getHeight(int num) {
		int height = 1;

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0) {
					height = height + 1;
				} else {
					height = height * 2;
				}
			}
		}

		return height;
	}
}