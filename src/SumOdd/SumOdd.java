package SumOdd;

public class SumOdd {
    public static boolean isOdd(int number){
        if(number > 0){
            if (number % 2 !=0){
                return true;
            }
            return false;
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        if((start > end) || (start < 0 || end < 0 )){
            return -1;
        }

        int sum=0;
        for(int i= start; i <= end; i++){
            if(isOdd(i)){
                sum = sum + i;
            };
        }
        return sum;
    }
}
