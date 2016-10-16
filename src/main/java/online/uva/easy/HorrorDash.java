package online.uva.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HorrorDash {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			ArrayList<Integer> speeds = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				speeds.add(sc.nextInt());
			}
			System.out.println("Case " + (i + 1) + ": "
					+ Collections.max(speeds));
		}
		sc.close();
	}
}
