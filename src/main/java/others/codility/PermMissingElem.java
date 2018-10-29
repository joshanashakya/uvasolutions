package others.codility;

import java.util.stream.IntStream;

/**
 * Created by one-1 on 11/27/16.
 */
public class PermMissingElem {

    public static void main(String[] args) {
        int a[] = {2, 3, 1, 4};
        System.out.println(solution(a));
    }

    private static int solution(int[] A) {
        int range = A.length + 1;
        int sum = 0;
        for(int i = 0; i< A.length; i ++) {
            sum = sum ^ A[i];
        }

        for(int i = 1; i<= range; i++) {
            sum = sum ^ i;
        }
        return sum;
    }
}
