package project.euler;


public class Problem_4 {


    // Driver code
    public static void main(String[] args) {
        Integer product;
        Integer highestNum = 0;
        String strProduct;
        for(int i = 999; i>0; i--){
            for(int j = 999; j>0; j--){
                product = i*j;
                strProduct = product.toString();
                if(isPalindrome(strProduct)){
                    if(product>highestNum){
                        highestNum = product;
                        System.out.println(product);
                    }
                }
            }
        }
    }

    private static boolean isPalindrome(String s){
        boolean retStatement = false;
        StringBuilder newString1 = new StringBuilder();
        StringBuilder newString2 = new StringBuilder();
        if( !(s.length()%2 == 0) ){
            newString1.append(s, 0, ((s.length()-1)/2));
            newString2.append(s.substring( (((s.length()-1)/2) + 1)));
        }
        else{
            newString1.append(s, 0, (s.length()/2));
            newString2.append(s.substring( (s.length()/2)));
        }
        newString2.reverse();
        if(newString1.toString().equals(newString2.toString())){
            retStatement = true;
        }

        return retStatement;
    }
}

