import java.util.Scanner;

public class boj_2753 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int leapYear = sc.nextInt();

        if(leapYear%4 == 0 && leapYear%100 != 0){
            System.out.print(1);
        }else if(leapYear%400 ==0) {
            System.out.print(1);
        }else{
            System.out.print(0);
        }

        sc.close();
    }
}
