package others.codility;

/**
 * Created by one-1 on 1/21/17.
 */
public class MinAvgTwoSlice {

    public static void main(String[] args) {
        int[] A = {4, 2, 2, 5, 1, 5, 8};
        int result = solution(A);
        System.out.println(result);
    }

    private static int solution(int A[]) {
        // we need to calculate average of 2 and 3 elements since all the averages of others are them
        int startIndex = 0;
        double minAvg = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            double avg2 = (double) (A[i] + A[i + 1]) / 2;
            double avg3;
            double minAvgi;
            if (i + 2 < A.length) {
                avg3 = (double) (A[i] + A[i + 1] + A[i + 2]) / 3;
                minAvgi = avg2 > avg3 ? avg3 : avg2;
            } else {
                minAvgi = avg2;
            }
            if (minAvgi < minAvg) {
                startIndex = i;
                minAvg = minAvgi;
            }
        }
        return startIndex;
    }
}
