import java.util.*;
public class SpeedingTicket {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] limit = new int[100];
        int[] bessie = new int[100];

        int pos = 0;
        for (int i = 0; i < n; i++) {
            int length = sc.nextInt();
            int speed = sc.nextInt();
            for (int j = pos; j < pos + length; j++) {
                limit[j] = speed;
            }
            pos += length;
        }

        pos = 0;
        for (int i = 0; i < m; i++) {
            int length = sc.nextInt();
            int speed = sc.nextInt();
            for (int j = pos; j < pos + length; j++) {
                bessie[j] = speed;
            }
            pos += length;
        }

        int maxOver = 0;
        for (int i = 0; i < 100; i++) {
            maxOver = Math.max(maxOver, bessie[i] - limit[i]);
        }

        System.out.println(maxOver);
    }
}

