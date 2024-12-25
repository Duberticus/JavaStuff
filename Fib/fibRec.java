import java.util.Scanner;
public class fibRec {

    public int fibMethod(int counter,int fib){
        if(counter = 0){
    return fib;
        }else{
            return fibMethod(counter-1 ,  fib);
        }
    }

    public static void main(String[] args) {
        System.out.println("enter fib number");
        Scanner scan = new Scanner(System.in);
        int counter = scan.nextInt();
        int base = 1;
        int result = fibMethod();
        System.out.println(result);
      
    }
}
