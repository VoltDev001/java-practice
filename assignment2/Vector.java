import java.util.Scanner;
public class Vector {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of first vector : ");
        VectorOperations V1 = new VectorOperations(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Enter values of second vector : ");
        VectorOperations V2 = new VectorOperations(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        VectorOperations resultAdd = V2.add(V1);
        System.out.println("Addition = " + resultAdd.x + "i +  " + resultAdd.y + "j + " + resultAdd.z + "k");
        VectorOperations resultSub = V2.subtract(V1);
        System.out.println("Subtraction = " + resultSub.x + "i +  " + resultSub.y + "j + " + resultSub.z + "k");
        VectorOperations resultVProduct = V2.vectorProduct(V1);
        System.out.println("Vector Product = " + resultVProduct.x + "i +  " + resultVProduct.y + "j + " + resultVProduct.z + "k");
        double resultDProduct= V2.dotProduct(V1);
        System.out.println("Dot Product = " + resultDProduct);
        sc.close();
    }
}
class VectorOperations{
    double x;
    double y;
    double z;

    VectorOperations(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    VectorOperations add(VectorOperations other){
        double x = this.x + other.x;
        double y = this.y + other.y;
        double z = this.z + other.z;
        return new VectorOperations(x, y, z);
    }

    VectorOperations subtract(VectorOperations other){
        double x = this.x - other.x;
        double y = this.y - other.y;
        double z = this.z - other.z;
        return new VectorOperations(x, y, z);
    }

    VectorOperations vectorProduct(VectorOperations other){
        double x = (this.z * other.y) - (this.y * other.z);
        double y = (this.x * other.z) - (this.z * other.x);
        double z = (this.y * other.x) - (this.x * other.y);
        return new VectorOperations(x, y, z);
    }

    double dotProduct(VectorOperations other){
        return (this.x * other.x) + (this.y * other.y) + (this.z * other.z);
    }

    // VectorOperations scalarMultiply(double scalar){

    // }

}
