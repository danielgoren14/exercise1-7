import java.util.Scanner;

public class exercise1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the coefficient of the first variable in the quadratic equation");
        int coefficient1 = scanner.nextInt();
        System.out.println("Please enter the coefficient of the second variable in the quadratic equation");
        int coefficient2 = scanner.nextInt();
        System.out.println("Please enter the coefficient of the third variable in the quadratic equation");
        int coefficient3 = scanner.nextInt();
        double discriminant = coefficient2*coefficient2 - 4 * coefficient1 * coefficient3;
        double solution1 = ((-1 * coefficient2)+ Math.sqrt(coefficient2*coefficient2 - 4 * coefficient1 * coefficient3))/ (2 * coefficient1);
        double solution2 = ((-1 * coefficient2)- Math.sqrt(coefficient2*coefficient2 - 4 * coefficient1 * coefficient3))/ (2 * coefficient1);
        if(discriminant == 0){
            System.out.println("There is only one solution for this quadratic equation, which equals to " + solution1);
        }
        else if(discriminant > 0){
            System.out.println("There are 2 solutions for this quadratic equation, which equals to "+ solution1 + " and to " + solution2);
        }
        else{
            System.out.println("There are no any solutions for this quadratic equation");
        }
    }
}