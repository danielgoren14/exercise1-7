import java.util.Scanner;

public class sumOfDigits{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do{
            System.out.println("Please enter a positive number");
            userInput = scanner.nextInt();
        }while(userInput <= 0);
        int sum = 0;
        int modulu;
        while(userInput > 0) {
            modulu = userInput % 10;
            sum += modulu;
            userInput = userInput / 10;
        }
        System.out.println("The sum of the digits of this number is "+ sum);
    }
}
