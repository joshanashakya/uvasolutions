package others.codility;

/**
 * Created by one-1 on 11/20/16.
 */
public class CyclicRotation {
    public static void main(String[] args) {
        int[] a = {9, 3, 9, 3, 9, 7, 9};
        for(int i = 0; i< a.length; i++)
        System.out.println(solution(a, 2)[i]);
    }

    private static int[] solution(int[] n, int r) {
        if (r == 0)
            return n;
        int size = n.length;
        int[] result = new int[size];
        for(int i = 0; i< size; i++) {
            result[(i + r) % size] = n[i];
        }
        return result;
    }
}
