package online.uva.easy;

import java.util.Scanner;

public class SummingDigits11332 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        while (n != 0) {
            System.out.println(calculate(calculate(calculate(n))));
            n = sc.nextLong();
        }
        sc.close();
    }

    private static long calculate(long n) { 
        long fn = 0;
        while (n != 0) {
            long r = n % 10;
            n = n / 10;
            fn += r;
        }
        return fn;
    }

}
