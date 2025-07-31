package COMPLETE_SEARCH;
import java.util.*;
class Milk_Pails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), m = sc.nextInt();
        int maxMilk = 0;
        for (int i = 0; i <= m / x; i++) {
            for (int j = 0; j <= m / y; j++) {
                int total = x * i + y * j;
                if (total <= m) {
                    maxMilk = Math.max(maxMilk, total);
                }
            }
        }
        System.out.println(maxMilk);
    }
}
//test cases:- https://usaco.org/current/data/pails_bronze_feb16.zip
//problem statement :- https://usaco.org/index.php?page=viewproblem2&cpid=615