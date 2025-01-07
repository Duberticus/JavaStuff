import java.util.ArrayList;
import java.util.Scanner;

public class fibInsane {

    public static ArrayList<Long> memo = new ArrayList<>(); 

        public FibInsane(){
            if(memo.isEmpty()){
            memo.add(0L);
            memo.add(1L);
        }
    }

    public long findFib(int number){
        while (memo.size() <= number) {
            
            long value = memo.get(memo.size() - 1) + memo.get(memo.size() - 2);
            memo.add(value);
        }
        return memo.get(number);
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

            fibInsane foo = new fibInsane();
            long result = foo.findFib(number);
            System.out.println(result);
           
        }
        scan.close();
    }
}

