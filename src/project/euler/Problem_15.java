package project.euler;

import java.math.BigInteger;

public class Problem_15 {
    public static void main(String[] args){
        int d = 20;
        BigInteger ans = nCr(2*d, d);
        System.out.println(ans);
    }

    private static BigInteger nCr(final int n, final int r) {
        BigInteger ret = BigInteger.ONE;
        for (int i = 0; i < r; i++) {
            ret = ret.multiply(BigInteger.valueOf(n-i))
                    .divide(BigInteger.valueOf(i+1));
        }
        return ret;
    }
}
