package book;

import java.util.Scanner;

public class ThreeN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int maxCycle = 0;
			int high = Math.max(i, j);
			int low = Math.min(i, j);
			String a;
			while (high >= low) {
				int count = count(high);
				if (maxCycle < count) {
					maxCycle = count;
				}
				high--;
			}
			System.out.println(i + " " + j + " " + maxCycle);
		}
		sc.close();
	}

	private static int count(int j) {
		int cnt = 1;
		while (j != 1) {
			cnt++;
			if (j % 2 == 0) {
				j = j / 2;
			} else {
				j = (j * 3) + 1;
			}
		}
		return cnt;
	}
}
