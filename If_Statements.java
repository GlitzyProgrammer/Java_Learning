import java.util.Scanner;

public class If_Statements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1,
            number2;
        
        System.out.print("Enter first integer ");
        number1 = input.nextInt();
        System.out.print("Enter in second integer ");
        number2 = input.nextInt();

        if(number1 == number2)
            System.out.printf("%d == %d%n",number1,number2); 
        if (number1 != number2)
            System.out.printf("%d != %d%n",number1,number2); 
        if (number1 < number2)
            System.out.printf("%d < %d%n",number1,number2); 
        if (number1 > number2)
            System.out.printf("%d > %d%n",number1,number2);
        if (number1 >= number2)  
            System.out.printf("%d >= %d%n",number1,number2);
        if (number1 <= number2)  
            System.out.printf("%d <= %d%n",number1,number2);

        // As I understand the comparative works the same as other programing langs

    }
}
