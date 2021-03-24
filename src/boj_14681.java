import java.util.Scanner;

public class boj_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int two = sc.nextInt();

        if (first > 0 && two > 0) {
            System.out.print(1);
        } else if (first < 0 && two > 0) {
            System.out.print(2);
        }else if(first > 0 && two < 0){
            System.out.print(4);
        }else if(first < 0 && two < 0){
            System.out.print(3);
        }

        sc.close();

    }
}
