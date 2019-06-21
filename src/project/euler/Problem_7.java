package project.euler;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_7 {
    public static void main(String[] args){
        List<Double> primeList = new ArrayList<>();
        primeList.add(2d);

        for(double i = 3; i<10000000000000d; i++) {
            if (isPrime(i)) {
                primeList.add(i);
            }
            if (primeList.size() == 10001){
                System.out.println(primeList.get(10000));
                break;
            }
        }
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
