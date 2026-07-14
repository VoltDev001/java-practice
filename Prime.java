public class Prime {
    public static void main(String args[]){
        P P1 = new P(20);
        P1.calPrime();
    }
}
class P{
    int count;
    P(int count){
        this.count = count;
    }
    void calPrime(){
        for(int i=2 ; count>0; i++){
            boolean isPrime = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count--;
                System.out.print(i + "\t");
            }
        }
    }
}