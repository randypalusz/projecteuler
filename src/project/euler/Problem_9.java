package project.euler;

public class Problem_9 {
    public static void main(String[] args){
        Integer a = 1;
        Integer b = 1;
        Double c = 1.0;
        for(a = 1; a < 1000; a++){
            for(b = 1; b < a; b++){
                c = Math.sqrt((a*a) + (b*b));
                if( (a + b + c) == 1000 ){
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(a*b*c);
                }
            }
        }
    }
}
