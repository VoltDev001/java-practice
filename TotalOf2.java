import java.util.Scanner;

public class TotalOf2{
    public static void main(String args[]){
        Marks M1 = new Marks();
        M1.takeinput();
        System.out.println("Total Marks : " + M1.totalMarks());
    }
}
class Marks{
    int mark1, mark2;
    void takeinput(){
        System.out.println("Enter marks of both subject: ");
        Scanner input = new Scanner(System.in);
        this.mark1 = input.nextInt();
        this.mark2 = input.nextInt();
        input.close();
    }
    int totalMarks(){
        return mark1 + mark2;
    }
}