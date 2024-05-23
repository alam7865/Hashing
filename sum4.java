import java.util.*;

public class sum4 {
    public static void main(String[] args) {
        int arr[] = { 10, 2, 3, 4, 5, 7, 8 };
        int k1 = 23;

        Arrays.sort(arr);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i1 = 0; i1 < arr.length; i1++) {
            map.put(arr[i1], 1);
        }

        for (int g = 1; g < arr.length; g++) {

        }
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    int sum = arr[i] + arr[j] + arr[j];
                    if (map.containsKey(k1 - sum)) {
                        int z1 = map.get(k1 - sum);
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " " + z1);
                        System.out.println();
                    }
                    // for (int l = k + 1; l < arr.length; l++) {
                    // if (arr[i] + arr[j] + arr[k] + arr[l] == k1) {
                    // System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " " + arr[l]);
                    // System.out.println();
                    // break;
                    // }
                    // }

                }
            }
        }
    }
}
