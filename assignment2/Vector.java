import java.util.Scanner;
public class Vector {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of first vector : ");
        VOperations V1 = new VOperations(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Enter values of second vector : ");
        VOperations V2 = new VOperations(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Enter scalar number : ");
        double num = sc.nextDouble();
        VOperations resultAdd = V2.add(V1);
        VOperations resultSub = V2.subtract(V1);
        VOperations resultVProduct = V2.vectorProduct(V1);
        VOperations resultSMultiply = V1.scalarMultiply(num);
        VOperations resultSDivide = V1.scalarDivide(num);
        double resultDProduct= V2.dotProduct(V1);
        System.out.print("Addition = ");
        resultAdd.display();
        System.out.print("Subtraction = ");
        resultSub.display();
        System.out.print("Vector Product = ");
        resultVProduct.display();
        System.out.print("Multiplication with Scalar = ");
        resultSMultiply.display();
        System.out.print("Division with Scalar = ");
        resultSDivide.display();
        System.out.println("Dot Product = "  + resultDProduct);
        sc.close();
    }
}
class VOperations{
    double x;
    double y;
    double z;

    VOperations(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    void display(){
        System.out.println(this.x + "i + " + this.y + "j + " + this.z + "k");
    }

    VOperations add(VOperations other){
        double x = this.x + other.x;
        double y = this.y + other.y;
        double z = this.z + other.z;
        return new VOperations(x, y, z);
    }

    VOperations subtract(VOperations other){
        double x = this.x - other.x;
        double y = this.y - other.y;
        double z = this.z - other.z;
        return new VOperations(x, y, z);
    }

    VOperations vectorProduct(VOperations other){
        double x = (this.z * other.y) - (this.y * other.z);
        double y = (this.x * other.z) - (this.z * other.x);
        double z = (this.y * other.x) - (this.x * other.y);
        return new VOperations(x, y, z);
    }

    VOperations scalarMultiply(double scalar){
        double x = this.x * scalar;
        double y = this.y * scalar;
        double z = this.z * scalar;
        return new VOperations(x, y, z);
    }

    VOperations scalarDivide(double scalar){
        double x = this.x / scalar;
        double y = this.y / scalar;
        double z = this.z / scalar;
        return new VOperations(x, y, z);
    }

    double dotProduct(VOperations other){
        return (this.x * other.x) + (this.y * other.y) + (this.z * other.z);
    }
}
