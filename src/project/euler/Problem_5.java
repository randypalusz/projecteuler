package project.euler;

public class Problem_5 {
    public static void main(String[] args){
        int i = 0;
        int number = 1;
        for(i = 2520; i<1000000000; i++){
            for(number = 1; number<=20; number++){
                if(i%number == 0){
                    if(number==20){
                        System.out.println(i);
                    }
                }
                else {break;}
            }
        }
    }
}
