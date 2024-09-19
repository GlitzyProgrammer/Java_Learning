import java.util.Scanner; 

public class Adding_Ints
{

    public static void main(String[] args) {
        // this creates a scanner to receive information 
        Scanner input = new Scanner(System.in);
        // Scanner is the variable type and the input is where it reads from
        //Normal variable decarlition
        int number1;
        int number2;
        int sum;

        System.out.print("Enter first integer ");//prompt
        number1 = input.nextInt();//reads input and checks if it is an int or the program terminates
        System.out.print("Enter second integer ");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("Sum is %d%n",sum);


    }
    
}
// all varibles must be delceared with a type before first use