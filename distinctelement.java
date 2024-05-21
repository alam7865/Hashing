import java.util.*;

public class distinctelement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 4, 2, 3 };
        int n = 7;
        int k = 4;
        int x = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i < k) {
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            } else {
                list.add(map.size());
                if (map.containsKey(arr[x])) {
                    if (map.get(arr[x]) == 1) {
                        map.remove(arr[x]);
                    } else {
                        map.put(arr[x], map.get(arr[x]) - 1);
                    }
                }
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

                x++;
            }
        }
        list.add(map.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // System.out.println(list.size());
    }
}
