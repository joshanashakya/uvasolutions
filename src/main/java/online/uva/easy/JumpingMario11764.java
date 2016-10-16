package online.uva.easy;

import java.util.Scanner;

public class JumpingMario11764 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int t = sc.nextInt();
			for (int i = 0; i < t; i++) {
				int n = sc.nextInt();
				int[] a = new int[n];
				for (int j = 0; j < n; j++) {
					a[j] = sc.nextInt();
				}
				findJump((i + 1), a);
			}
		}
	}

	private static void findJump(int no, int[] a) {
		int first = a[0];
		int high = 0;
		int low = 0;
		for (int i = 1; i < a.length; i++) {
			int second = a[i];
			if (first > second) {
				low++;
			} else if (first < second) {
				high++;
			}
			first = second;
		}
		System.out.println("Case " + no + ": " + high + " " + low);
	}

}
