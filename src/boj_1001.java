import java.util.Scanner;

public class boj_1001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second =  sc.nextInt();

        int answer = first - second;

        System.out.print(answer);

        sc.close(); // scanner을 종료한다.
    }
}
