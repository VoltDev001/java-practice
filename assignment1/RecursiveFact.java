import java.util.Scanner;

public class RecursiveFact {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        long num = input.nextLong();
        FindFactorial1 F1 = new FindFactorial1(num);
        System.out.println("Factorial of " + num + " = " + F1.Find(num));
        input.close();
    }
}
class FindFactorial1{
    long n;
    FindFactorial1(long n){
        this.n = n;
    }
    long Find(long n){
        if(n==0 || n==1)
            return 1;
        return n*Find(n-1);
    }
}