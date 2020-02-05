package project.euler;

public class Problem_14 {
    public static void main(String[] args){
        long maxLength = 0;
        long maxNum = 0;
        long length;
        for(int i = 1; i < 1000000; i++){
            length = generateCollatz(i);
            if(length > maxLength){
                maxLength = length;
                maxNum = i;
            }
        }
        System.out.println(maxNum);
    }

    private static long generateCollatz(int n){
        long cnt = 0;
        long temp = n;
        while(temp != 1){
            if(temp%2 == 0){ temp = temp/2; }
            else{ temp = 3*temp + 1; }
            cnt++;
        }
        return cnt;
    }

}
