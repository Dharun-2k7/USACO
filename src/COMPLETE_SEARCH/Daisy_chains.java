package COMPLETE_SEARCH;
import java.util.*;
public class Daisy_chains {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int valid=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                double avg=0;
                for(int k=i;k<=j;k++){
                    avg+=arr[k];
                }
                avg/=j-i+1;

                for(int idx=i;idx<=j;idx++){
                    if(arr[idx]==avg){
                        valid++;
                        break;
                    }
                }
            }
        }
        System.out.println(valid);
    }
}
//test-cases : https://usaco.org/current/data/prob2_bronze_dec20.zip
//problem-statement: https://usaco.org/index.php?page=viewproblem2&cpid=1060
