package project.euler;

public class Problem_17 {
    public static void main(String[] args){
        final int ONE_THROUGH_NINE = (3+3+5+4+4+3+5+5+4);
        final int TEN_THROUGH_NINTEEN = (3+6+6+8+8+7+7+9+8+7);
        int currentNum = 1;
        int letterCount = 0;
        while(currentNum <= 1000){
            if(currentNum < 10){
                currentNum += 10;
                letterCount += ONE_THROUGH_NINE;
                continue;
            }
            if( (currentNum >= 10) && (currentNum < 20) ){
                currentNum += 10;
                letterCount += TEN_THROUGH_NINTEEN;
                continue;
            }

        }
    }
}
