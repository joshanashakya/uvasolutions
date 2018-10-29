package others.codility;

import java.util.Scanner;

/**
 * Created by one-1 on 11/14/16.
 */
public class BinaryGap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getMaxGap(n));
    }

    private static int getMaxGap(int n) {
        String num = Integer.toBinaryString(n);
        int i = num.length() - 1;
        while(num.charAt(i) == '0')
            i--;
        int max = 0;
        int count = 0;
        for(; i >= 0; i--) {
            if(num.charAt(i) == '1') {
                max = Math.max(max, count);
                count = 0;
            } else {
                count ++;
            }
        }
        max = Math.max(max, count);
        return max;
    }
}
