import java.util.*;

public class pointsInStraightLine {
    public static void main(String[] args) {
        // int x[] = { 1, 2, 3 };
        // int y[] = { 1, 2, 3 };

        int x[] = { 1, 3, 5, 4, 2, 1 };
        int y[] = { 1, 2, 3, 1, 3, 4 };

        int count = 0;
        for (int i = 0; i < x.length; i++) {
            HashMap<Double, Integer> map = new HashMap<>();
            double x1 = 0;
            for (int j = 0; j < x.length; j++) {

                if (i != j) {

                    if (x[j] - x[i] == 0) {
                        x1 = Integer.MAX_VALUE;
                    } else {
                        x1 = (double) (y[j] - y[i]) / (double) (x[j] - x[i]);
                    }

                    map.put(x1, map.getOrDefault(x1, 0) + 1);
                    count = Math.max(count, map.get(x1));
                }

            }
        }

        System.out.println(count + 1);
    }
}
