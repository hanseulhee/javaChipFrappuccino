import java.util.Scanner;

public class boj_2440 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int j= i+1; j<=n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();

    }
}
