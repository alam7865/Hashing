import java.util.*;

public class fraction {
    public static void main(String[] args) {
        // int num = 16;
        // int dem = 13;
        // StringBuilder sb = new StringBuilder();
        // int x = num % dem;
        // if (x != 0) {
        // int x1 = num / dem;
        // sb.append(x1);
        // sb.append(".");

        // HashMap<Integer, Integer> map = new HashMap<>();
        // int rem = num % dem;

        // while (rem != 0) {
        // rem = rem * 10;
        // int q1 = rem / dem;

        // if (map.containsKey(q1)) {
        // // char ch = sb.charAt(sb.length() - 1);
        // sb.insert(map.get(rem), "(");
        // sb.append(")");
        // break;
        // } else {
        // map.put(rem, sb.length());
        // int temp = (rem * 10) / dem;
        // sb.append(temp);
        // rem = (rem * 10) % dem;
        // }
        // }

        // } else {
        // sb.append(num / dem);
        // }

        // sb.append(1);
        // sb.append(2);
        // sb.append(3);

        // String ssr = "0.12334";
        // System.out.println(ssr.substring(2, ssr.length()));
        // System.out.println(sb.toString());

        // System.out.println(180 % 19);

        int n = 18;
        int d = 19;
        StringBuilder ans = new StringBuilder(Integer.toString(n / d));

        int rem = n % d;
        if (rem == 0)
            // return ans.toString();
            System.out.println(ans.toString());

        ans.append('.');
        Map<Integer, Integer> m = new HashMap<>();

        while (rem != 0) {
            if (m.containsKey(rem)) {
                System.out.println(m.get(rem));
                ans.insert(m.get(rem), "(");

                ans.append(')');
                break;
            } else {
                m.put(rem, ans.length());
                int temp = (rem * 10) / d;
                ans.append(temp);
                rem = (rem * 10) % d;
            }
        }

        // return ans.toString();

        System.out.println();
        System.out.println(ans.toString());
    }
}
