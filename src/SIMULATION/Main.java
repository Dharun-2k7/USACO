import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt(),n=sc.nextInt(),k= sc.nextInt();
        sc.nextLine();
        for(int i=0;i<m;i++){
            String s=sc.nextLine();
            StringBuilder big= new StringBuilder();
            for(int j=0;j<n;j++){
                char c=s.charAt(j);
                for(int l=0;l<k;l++){
                    big.append(c);
                }
            }
            for(int x=0;x<k;x++){
                System.out.println(big);
            }
        }
    }
}