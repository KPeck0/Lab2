import java.util.Scanner;

public class SumofNumbers {
    public static void main(String[] args) {
        int userNumber = -1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        
        while (userNumber < 1){
            System.out.println("Please enter a positive nonzero integer");
            userNumber = scanner.nextInt();
        }
        for(int number = 1; number <= userNumber; number++){
            sum = sum + number;
        }
      
        System.out.println("The sum of number from 1 to " + userNumber + " is " + sum); 
    }
}
