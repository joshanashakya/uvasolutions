package others.codility;

import java.util.stream.IntStream;

/**
 * Created by one-1 on 12/18/16.
 */
public class MaxCounters {

    public static void main(String[] args) {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] result = solution(5, A);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private static int[] solution(int N, int[] A) {
        int maxCount = 0;
        int[] cnt = new int[N];
        int counterCount = 0;

        for (int i = 0; i < A.length; i++) {
            int index = A[i] - 1;
            if (index == N) {
                counterCount = maxCount;
            } else {
                if (cnt[index] < counterCount)
                    cnt[index] = counterCount;
                cnt[index] = cnt[index] + 1;
                maxCount = maxCount > cnt[index] ? maxCount : cnt[index];
            }
        }

        for (int i = 0; i < N; i++) {
            if (cnt[i] < counterCount)
                cnt[i] = counterCount;
        }
        return cnt;
    }
}
