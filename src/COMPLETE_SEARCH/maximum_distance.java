import java.util.*;
class maximum_distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff1 = a[i] - a[j];
                int diff2 = b[i] - b[j];
                int square = diff1 * diff1 + diff2 * diff2;
                maxi = Math.max(maxi, square);
            }

        }
        System.out.println(maxi);
    }
}
