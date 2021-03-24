import java.util.Scanner;

public class boj_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=1; i<=num; i++) { // 1부터 num까지 i를 1씩 증가시키면서 반복
            for(int j=1; j<=i; j++) { // 1부터 i까지 j를 1씩 증가시키면서 반복
                System.out.print("*"); // * 출력
            }
            System.out.println();
        }

        sc.close();
    }
}
