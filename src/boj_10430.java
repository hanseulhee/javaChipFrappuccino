import java.util.Scanner;

public class boj_10430 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int first = (A+B)%C;
        int second = ((A%C) + (B%C))%C;
        int third =  (A*B)%C;
        int four = ((A%C) * (B%C))%C;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(four);

        sc.close();

    }
}
