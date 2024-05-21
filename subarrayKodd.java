import java.util.*;

public class subarrayKodd {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 1 };
        int k = 3;
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                count++;
            } else {
                if (sum < k) {
                    map.put(sum, i);
                } else {
                    int idx1 = sum - k;
                    if (map.containsKey(idx1)) {
                        count++;
                    }
                    map.put(sum, i);
                }
            }
        }

        System.out.println(count);
    }
}
