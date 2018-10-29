package book;

import java.util.Scanner;

/**
 * Created by one-1 on 11/19/16.
 */
public class TheTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            float[] cost = new float[n];
            float total = 0f;
            for (int i = 0; i < n; i++) {
                cost[i] = (sc.nextFloat()) * 100;
                total += cost[i];
            }
            System.out.println(String.format("$%.2f", getTotal(n, cost, total)));
            n = sc.nextInt();
        }
    }

    private static float getTotal(int n, float[] cost, float total) {
        float avg = total / n;
        float neg = 0f;
        float pos = 0f;
        for (int i = 0; i < n; i++) {
            float amt = (cost[i] - avg);
            if (amt < 0) {
                neg += amt;
            } else {
                pos += pos;
            }
        }
        return -neg > pos ? -neg : pos;
    }
}