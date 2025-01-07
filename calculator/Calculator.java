import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();


<<<<<<< HEAD

        System.out.println("Multiplication:");

=======
        System.out.println("Multiplication:");


     



>>>>>>> 96f539cbddffd22fc39349660aef6543592a741e
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
<<<<<<< HEAD

=======
>>>>>>> 96f539cbddffd22fc39349660aef6543592a741e
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;

                default:


                System.out.println("Invalid operator!");
                return;

           

        }

        System.out.println("Result: " + result);
        
    }
}