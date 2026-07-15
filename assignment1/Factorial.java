import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        long num = input.nextLong();
        FindFactorial F1 = new FindFactorial(num);
        System.out.println("Factorial of " + num + " = " + F1.Find());
        input.close();
    }
}
class FindFactorial{
    long n;
    FindFactorial(long n){
        this.n = n;
    }
    long Find(){
        long fact=1;
        for(long i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
}