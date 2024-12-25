import java.util.Scanner;

public class fibBasic{
    public static void main(String[] args) {
        System.out.println("enter fibanacci number");
         Scanner scan = new Scanner(System.in);
         int fib = scan.nextInt();
         int sum = 0;
         int x = 1;
         int y = 0;
         for(int i = 0;i <= fib; i++){
            sum = x + y;
            x = y;
            y = sum;
         }
         System.out.println(sum);
         scan.close();
    }
}
