package project.euler;

public class Problem_12 {
    public static void main(String[] args){
        long triangleNum = 1;
        long iterNum = 2;
        do{
            triangleNum = triangleNum + iterNum;
            iterNum++;
        }
        while(!getDivisors(triangleNum));
        System.out.println(triangleNum);
    }

    private static boolean getDivisors(long num){
        int numDivisors = 0;
        boolean meetsNod = false;
        int sqrt = (int) Math.sqrt(num);

        if(sqrt*sqrt == num){
            numDivisors--;
        }

        for(int i = 1; i<=sqrt; i++){
            if((num%i) == 0){
                numDivisors = numDivisors + 2;
            }
            if(numDivisors > 500){
                meetsNod = true;
                break;
            }
        }

        return meetsNod;
    }

}


