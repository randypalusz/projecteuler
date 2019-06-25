package project.euler;

import java.util.ArrayList;

public class Problem_8 {
    public static void main(String[] args){
        String hugeNumberString = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
        int[] numArray = new int[13];
        long maxProduct = 0;
        long tempProduct = 1;

        for(int i = 0; i<hugeNumberString.length()-12; i++){
            numArray[0] = Character.getNumericValue(hugeNumberString.charAt(i));
            numArray[1] = Character.getNumericValue(hugeNumberString.charAt(i+1));
            numArray[2] = Character.getNumericValue(hugeNumberString.charAt(i+2));
            numArray[3] = Character.getNumericValue(hugeNumberString.charAt(i+3));
            numArray[4] = Character.getNumericValue(hugeNumberString.charAt(i+4));
            numArray[5] = Character.getNumericValue(hugeNumberString.charAt(i+5));
            numArray[6] = Character.getNumericValue(hugeNumberString.charAt(i+6));
            numArray[7] = Character.getNumericValue(hugeNumberString.charAt(i+7));
            numArray[8] = Character.getNumericValue(hugeNumberString.charAt(i+8));
            numArray[9] = Character.getNumericValue(hugeNumberString.charAt(i+9));
            numArray[10] = Character.getNumericValue(hugeNumberString.charAt(i+10));
            numArray[11] = Character.getNumericValue(hugeNumberString.charAt(i+11));
            numArray[12] = Character.getNumericValue(hugeNumberString.charAt(i+12));
            for(int j = 0; j<13; j++){
                tempProduct = tempProduct*numArray[j];
            }
            if(tempProduct>maxProduct){
                maxProduct = tempProduct;

            }
            tempProduct = 1;
        }

        System.out.println(maxProduct);

    }
}
