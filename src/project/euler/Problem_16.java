package project.euler;

import java.math.BigInteger;

public class Problem_16 {
    public static void main(String[] args){
        BigInteger answer = BigInteger.ZERO;
        BigInteger n = BigInteger.valueOf(2).pow(1000);
        while( n.compareTo(BigInteger.valueOf(0)) > 0 ){
            answer = answer.add(n.mod(BigInteger.valueOf(10)));
            n = n.divide(BigInteger.valueOf(10));
        }
        System.out.println(answer);
    }
}
