package others.codility;

/**
 * Created by one-1 on 11/27/16.
 */
public class FrogJmp {

    public static void main(String[] args) {
        System.out.println(solution(10, 80, 30));
    }

    private static int solution(int X, int Y, int D) {
        int diff = Y - X;
        double jumps = (double) diff / D;
        return (int) (jumps - Math.round(jumps) > 0 ? Math.round(jumps) + 1 : Math.round(jumps));
    }
}
