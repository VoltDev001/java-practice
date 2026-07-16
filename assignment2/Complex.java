import java.util.Scanner;
public class Complex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of first complex number: ");
        ComplexOperations C1 = new ComplexOperations(sc.nextDouble(), sc.nextDouble());
         System.out.println("Enter values of second complex number: ");
        ComplexOperations C2 = new ComplexOperations(sc.nextDouble(), sc.nextDouble());
        ComplexOperations resultAdd = C2.add(C1);
        System.out.println("Addition = " + resultAdd.real + " +  " + resultAdd.image + "i");
        ComplexOperations resultSub = C2.subtract(C1);
        System.out.println("Subtraction = " + resultSub.real + " +  " + resultSub.image + "i");
        ComplexOperations resultMul = C2.multiply(C1);
        System.out.println("Multiplication = " + resultMul.real + " +  " + resultMul.image + "i");
        ComplexOperations resultDiv = C2.divide(C1);
        System.out.println("Division = " + resultDiv.real + " +  " + resultDiv.image + "i");
        ComplexOperations resultInv = C1.inverse();
        System.out.println("Inverse = " + resultInv.real + " - " + resultInv.image + "i");
        sc.close();
    }
}
class ComplexOperations{
    double real;
    double image;

    ComplexOperations(double real, double image){
        this.real = real;
        this.image = image;
    }
    ComplexOperations add(ComplexOperations other){
        double real = this.real + other.real;
        double image = this.image + other.image;
        return new ComplexOperations(real, image);
    }
    ComplexOperations subtract(ComplexOperations other){
        double real = this.real - other.real;
        double image = this.image - other.image;
        return new ComplexOperations(real, image);
    }
    ComplexOperations multiply(ComplexOperations other){
        double real = (this.real * other.real) - (this.image * other.image);
        double image = (this.real * other.image) + (this.image * other.real);
        return new ComplexOperations(real, image);
    }
    ComplexOperations divide(ComplexOperations other){
        double real = ((this.real * other.real) + (this.image * other.image)) / ((other.real * other.real) + (other.image * other.image));
        double image = ((this.real * other.image) - (this.image * other.real)) / ((other.real * other.real) + (other.image * other.image));
        return new ComplexOperations(real, image);
    }
    ComplexOperations inverse(){
        double real = this.real / ((this.real * this.real) + (this.image * this.image));
        double image = this.image / ((this.real * this.real) + (this.image * this.image));
        return new ComplexOperations(real, image);
    }
}