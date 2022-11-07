package ForLoop;

public class SumOfTwoNumbers {
    public static void sumOf3And5 (){
        int count = 0;
        int sum =0;

        for (int i= 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                count++;
                sum += i;
                System.out.println("A number that can me divided by both 3 & 5 is: " + i);
                if(count == 5){
                    System.out.println("The total sum of these numbers is: " + sum);
                    break;
                }
            }
        }
    }
}
