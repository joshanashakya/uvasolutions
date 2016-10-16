package others.hackerrank;

import java.util.Scanner;

/**
 * Created by one-1 on 9/18/16.
 */
public class CompareTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alice = 0;
        int bob = 0;
        int[] a = new int[3];
        int[] b = new int[3];
        for(int i = 0; i< 3; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i< 3; i++) {
            b[i] = sc.nextInt();
            if(a[i] > b[i]) {
                alice++;
            } else if(a[i] < b[i]) {
                bob++;
            }
        }
        System.out.println(alice + " " + bob);
        sc.close();
    }
}
