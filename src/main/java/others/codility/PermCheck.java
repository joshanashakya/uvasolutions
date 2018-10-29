package others.codility;

/**
 * Created by one-1 on 12/3/16.
 */
public class PermCheck {

    public static void main(String[] args) {
        int a[] = {4};
        System.out.println(solution(a));
    }

    private static int solution(int[] A) {
        int range = A.length;
        int sum = 0;
        for(int i = 0; i< A.length; i ++) {
            sum = sum ^ A[i];
        }

        for(int i = 1; i<= range; i++) {
            sum = sum ^ i;
        }
        return sum == 0 ? 1 : 0;
    }
}
