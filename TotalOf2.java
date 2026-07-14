public class TotalOf2{
    public static void main(String args[]){
        Marks M1 = new Marks(45, 65);
        System.out.println("Total Marks : " + M1.totalMarks());
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