import java.util.Scanner;
public class TotalOf2{
    public static void main(String args[]){
        System.out.println("Enter marks of two subjects: ");
        Scanner sc = new Scanner(System.in);
        Marks M1 = new Marks(sc.nextInt(), sc.nextInt());
        System.out.println("Total Marks : " + M1.totalMarks());
        // Marks M1 = new Marks(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        // System.out.println("Total Marks : " + M1.totalMarks());
        sc.close();
    }
}
class Marks{
    int mark1, mark2;

    Marks(int mark1, int mark2){
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    int totalMarks(){
        return mark1 + mark2;
    }
}