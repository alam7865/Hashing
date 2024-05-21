import java.util.*;

public class pairWithGivenXor {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 10, 15, 7, 6 };
        int B = 5;

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);

            int a = arr[i] ^ (-B);
            if (map.containsKey(-a)) {
                count++;
            }
        }

        System.out.println(count);
    }
}