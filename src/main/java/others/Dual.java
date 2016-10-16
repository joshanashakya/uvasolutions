package others;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dual {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for (int i = 0; i < t; i++) {
			int size = scanner.nextInt();
			List<Integer> array = new ArrayList<Integer>();
			for (int j = 0; j < size; j++) {
				int num = scanner.nextInt();
				if (isPrime(num)) {
					array.add(num);
				}
			}
			int s = array.size();
			if (s > 0) {
				int dual = 0;
				for (int j = 0; j < s; j++) {
					for (int k = 0; k < s; k++) {
						int singleDual = array.get(j) * array.get(k);
						if (dual < singleDual) {
							dual = singleDual;
						}
					}
				}
				System.out.println(dual);
			} else {
				System.out.println("-1");
			}
		}
	}

	private static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		if (num <= 3)
			return true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
