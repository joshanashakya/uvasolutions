package others.codility;

/**
 * Created by one-1 on 11/27/16.
 */
public class TapeEquilibrium {

    public static void main(String[] args) {
        int[] a = {-10, -20, -30, -40, 100};
        int[] b = {-1000, 1000};
        System.out.println(solution(b));
    }

    private static int solution(int[] a) {
        int length = a.length;

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum = sum + a[i];
        }

        int min = Integer.MAX_VALUE;
        int beforeSum = 0;
        // length-1 as we do not consider the beforesum as total sum
        for (int i = 0; i < length - 1; i++) {
            beforeSum = beforeSum + a[i];
            int afterSum = sum - beforeSum;
            int val = Math.abs(afterSum - beforeSum);
            min = min > val ? val : min;
        }
        return min;
    }
}
