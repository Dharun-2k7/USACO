package COMPLETE_SEARCH;
import java.util.*;

public class Diamond_Collector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] diamonds = new int[n];
        for (int i = 0; i < n; i++) {
            diamonds[i] = sc.nextInt();
        }
        int showcase = 0;
        for (int x : diamonds) {
            int satisfy = 0;
            for (int y : diamonds) {
                if (x<=y && y <= x + k) {
                    satisfy++;
                }
            }
            showcase = Math.max(satisfy, showcase);

        }
        System.out.println(showcase);
    }
}
//test-cases :- https://usaco.org/current/data/diamond_bronze_open16.zip
//problem-statement : https://usaco.org/index.php?page=viewproblem2&cpid=639