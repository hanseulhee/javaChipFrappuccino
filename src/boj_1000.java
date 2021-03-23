import java.util.Scanner;

public class boj_1000 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int two = sc.nextInt();

        int answer = first + two;

        System.out.print(answer);

        sc.close(); // scanner을 종료한다.

    }

}
