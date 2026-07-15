import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        System.out.print("Enter number of terms : ");
        Scanner sc = new Scanner(System.in);
        Fibo F1 = new Fibo(sc.nextInt());
        F1.findFibo();
        sc.close();
    }
}
class Fibo{
    long f1 = 0;
    long f2 = 1;
    int count;
    Fibo(int count){
        this.count = count;
    }
    void findFibo(){
        if(count == 1){
            System.out.println(f1 + " ");
        }
        else{
            System.out.print(f1 + " ");
            System.out.print(f2 + " ");
            long f;
            while(count>2){
                f = f1 + f2;
                System.out.print(f + " ");
                f1 = f2;
                f2 = f;
                count--;
            }
        }
    }
}