package book;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Minesweeper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int field = 1;
		while (n != 0 && m != 0) {
			String[] str = new String[n];
			char[][] characters = new char[n][m];
			for (int i = 0; i < n; i++) {
				str[i] = sc.next();
				char c[] = str[i].toCharArray();
				for (int j = 0; j < m; j++) {
					characters[i][j] = c[j];
				}
			}

			if (field == 1) {
				System.out.println("Field #" + field + ":");
				write("Field #" + field + ":");
			} else {
				System.out.println("\nField #" + field + ":");
				write("\nField #" + field + ":");
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (characters[i][j] == '*') {
						System.out.print("*");
						write("*");
					} else {
						System.out.print(count(characters, i, j, n, m));
						int a = count(characters, i, j, n, m);
						write(String.valueOf(a));
					}
				}
				System.out.println();
				write("\n");
			}
			field++;
			n = sc.nextInt();
			m = sc.nextInt();
		}
		sc.close();
	}

	private static int count(char a[][], int i, int j, int n, int m) {
		int count = 0;
		for (int k = (i == 0 ? 0 : i - 1); k < (i + 1 == n ? i + 1 : i + 2); k++) {
			for (int l = (j == 0 ? 0 : j - 1); l < (j + 1 == m ? j + 1 : j + 2); l++) {
				if (a[k][l] == '*') {
					count++;
				}
			}
		}
		return count;
	}

	private static void write(String str) {
		try {
			FileWriter fwriter = new FileWriter("minesweeper", true);
			fwriter.write(str);
			fwriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
