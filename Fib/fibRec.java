import java.util.Scanner;
public class fibRec {

    public int fibMethod(int counter){
        System.out.println(counter);
        if(counter == 0){
            return 0;
        }else if(counter == 1){
            return 1;
        }else{
          //  System.out.println(counter);
            return fibMethod(counter -1) + fibMethod(counter -2);
        }
    }

    public static void main(String[] args) {
        System.out.println("enter fib number");
        Scanner scan = new Scanner(System.in);
        int counter = scan.nextInt();
        fibRec fib= new fibRec();
        int result = fib.fibMethod(counter);
        System.out.println(result);
        scan.close();
    }
}
