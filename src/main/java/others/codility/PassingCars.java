package others.codility;

import java.util.Random;

/**
 * Created by one-1 on 1/14/17.
 */
public class PassingCars {

    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0 ,0 , 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0 ,0 , 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0 ,0 , 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0 ,0 , 1,0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0 ,0 , 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0 ,0 , 1};
        int result = solution(A);
        System.out.println(result);
    }

    private static int solution(int A[]) {
        // count no. of zeros
        int zeroCounts = 0;
        int pairCount = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                zeroCounts++;
            } else {
                pairCount += zeroCounts;
            }
        }
        if (pairCount > 1000000000 || (pairCount < 0 && (-1 * pairCount) > 1000000000))
            return -1;

        return pairCount;
    }
}
