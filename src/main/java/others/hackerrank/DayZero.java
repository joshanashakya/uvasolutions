package others.hackerrank;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by one-1 on 9/24/16.
 */
public class DayZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] n = new int[num];
        for (int i = 0; i < num; i++) {
            n[i] = sc.nextInt();
        }
        double mean = calculateMean(num, n);
        mergesort(n, 0, num - 1);
        double median = calculateMedian(num, n);
        int mode = calculateMode(n);
        System.out.printf("%.1f\n", mean);
        System.out.printf("%.1f\n", median);
        System.out.println(mode);
    }

    private static double calculateMean(int num, int[] n) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += n[i];
        }
        return (double) sum / num;
    }

    private static double calculateMedian(int num, int[] n) {
        if (num % 2 == 0) {
            return (double) (n[num / 2 - 1] + n[num / 2]) / 2;
        } else {
            return (double) n[(num / 2) + 1];
        }
    }

    private static int calculateMode(int[] n) {
        int num = n[0];
        int count = 1;
        int cmode = 1;
        int mode = num;

        for (int i = 1; i < n.length; i++) {
            if(n[i] == num) {
                count ++;
            } else {
                if(count > cmode) {
                    cmode = count;
                    mode = num;
                }
                count = 1;
                num = n[i];
            }
        }
        return mode;
    }

    //merge sort implementation
    private static void mergesort(int[] n, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergesort(n, low, mid);
        mergesort(n, mid + 1, high);
        merge(n, low, high, mid);
    }

    private static void merge(int[] n, int low, int high, int mid) {
        int i = low;
        int j = mid + 1;
        int[] res = new int[high + 1];
        for (int k = low; k <= high; k++) {
            if (i > mid) { // j has content but i is empty
                res[k] = n[j];
                j++;
            } else if (j > high) { // i has content but j is empty
                res[k] = n[i];
                i++;
            } else if (n[i] < n[j]) {
                res[k] = n[i];
                i++;
            } else {
                res[k] = n[j];
                j++;
            }
        }
        for (int k = low; k <= high; k++) {
            n[k] = res[k];
        }
    }
}
