import java.util.HashMap;
import java.util.Scanner;

public class fibDynamic{

    public static HashMap<Integer,Long> memo = new HashMap<>();

    public long findFib(int number){
        if(number ==1 ){
            return 1;
        }
        if(number == 0){
            return 0;
        }
        
        if(memo.containsKey(number)){
            return memo.get(number);
        }
          
            long value =  findFib(number -1) + findFib(number -2);
            memo.put(number, value);
            return value;
        }
    



public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    while(true){
            System.out.println("What is the fib number?");
            System.out.println("0 to quit");
            int number = scan.nextInt();
        if(number == 0){
            break;
        }

            fibDynamic foo = new fibDynamic();
            long result = foo.findFib(number);
            System.out.println(result);
            scan.close();
        }
    }
}