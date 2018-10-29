package others.codility;

/**
 * Created by one-1 on 1/14/17.
 */
public class CountDiv {

    public static void main(String[] args) {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int result = solution(10, 10, 7);
        System.out.println(result);
    }

    private static int solution(int A, int B, int K) {
        // calculate lowest divisible
        int mod = A % K;
        if(mod != 0)
            A += (K - mod);

        // calculate highest divisible
        B -= B % K;

        return (B - A)/K + 1;
    }
}
