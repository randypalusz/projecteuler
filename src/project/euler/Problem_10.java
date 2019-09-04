package project.euler;

public class Problem_10 {
    public static void main(String[] args){
        //Account for 2 being a prime number
        double sum = 2.0;

        for(double i = 3.0; i <= 2000000d; i++){
            if(isPrime(i)){
                sum = sum + i;
            }
        }

        System.out.println(sum);

    }

    private static boolean isPrime(double num){
        boolean retValue = true;
        for(long i = (long) Math.sqrt(num); i>1; i--){
            if(num%i == 0){
                retValue = false;
                break;
            }
        }
        return retValue;
    }
}
