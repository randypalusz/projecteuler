package project.euler;

import java.util.HashMap;

class Problem_17 {
    public static void main(String[] args){
        HashMap<Integer, Integer> countMap = new NumberCount().intCountMap;
        long letterCount = 0;
        int hundredDigit=0;
        int tensDigit=0;
        int onesDigit;
        for(int i = 1; i<=1000; i++){
            hundredDigit = (i/100)%10;
            tensDigit = (i/10)%10;
            onesDigit = i%10;
            if(tensDigit < 2){ letterCount += countMap.get(i%100); }
            if(tensDigit >= 2){ letterCount += countMap.get(tensDigit*10) + countMap.get(onesDigit); }
            if(i%100 == 0 && i!= 1000){ letterCount += countMap.get(100) + countMap.get(hundredDigit); }
            if((i>=100) && (i%100 != 0)){ letterCount += countMap.get(100) + countMap.get(hundredDigit) + 3; }
            if(i == 1000){ letterCount += countMap.get(1000); }
        }
        System.out.println(letterCount);
    }
}

class NumberCount {
    //<numberToBeAssessed, numberOfLettersInNumber>
    HashMap<Integer, Integer> intCountMap = new HashMap<>(){
        {
            put(0, 0);
            put(1, 3);
            put(2, 3);
            put(3, 5);
            put(4, 4);
            put(5, 4);
            put(6, 3);
            put(7, 5);
            put(8, 5);
            put(9, 4);
            put(10, 3);
            put(11, 6);
            put(12, 6);
            put(13, 8);
            put(14, 7);
            put(15, 7);
            put(16, 7);
            put(17, 9);
            put(18, 8);
            put(19, 9);
            put(20, 6);
            put(30, 6);
            put(40, 5);
            put(50, 5);
            put(60, 5);
            put(70, 7);
            put(80, 6);
            put(90, 6);
            //for "hundred"
            put(100, 7);
            put(1000, 11);
        }
    };

}
