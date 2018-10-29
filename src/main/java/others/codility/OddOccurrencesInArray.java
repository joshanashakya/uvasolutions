package others.codility;

/**
 * Created by one-1 on 11/19/16.
 */
public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] a = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution(a));
    }

    private static int solution(int[] n) {
        int num = 0;
        for(int i = 0; i< n.length; i++) {
            num = num ^ n[i];
        }
        return num;
    }
}
