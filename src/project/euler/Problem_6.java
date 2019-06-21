package project.euler;

import java.util.ArrayList;

public class Problem_6 {
    public static void main(String[] args){
        ArrayList<Integer> numList = new ArrayList<>();
        double sumSquareResult;
        double squareSumResult;

        for(int i = 1; i<=100; i++){
            numList.add(i);
        }
        //List Generated
        sumSquareResult = sumSquares(numList);
        squareSumResult = squareSum(numList);
        System.out.printf("%f", squareSumResult-sumSquareResult);
    }

    private static double sumSquares(ArrayList<Integer> list){
        double sum = 0;
        for(Integer element : list){
            sum = sum + Math.pow(element, 2);
        }
        return sum;
    }

    private static double squareSum(ArrayList<Integer> list){
        double sum = 0;
        for(Integer element : list){
            sum = sum + element;
        }
        sum = Math.pow(sum, 2);
        return sum;
    }
}
