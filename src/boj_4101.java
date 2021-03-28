import java.util.Scanner;

public class boj_4101 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();

        if(first > second){
            System.out.print("Yes");
        }else if(first < second){
            System.out.print("No");
        }else if(first == second){
            System.out.print("No");
        }else if(first == 0 && second == 0){
        }

    }
}
