// use the scanner class
import java.util.Scanner;
 public class javawarmup10aug23 {
     public static void main(String[] args){
         System.out.println("\n\n Welcome to the largest numbers program! \n\n");

         Scanner scanner = new Scanner(System.in);

         // Prompt the user for the first number.
         System.out.println("\n Please enter the first number in this space: ");
         int num1 = scanner .nextInt();

         System.out.println("\n you entered: " + num1);

         System.out.println("\n\n Now you can add a bigger number! \n\n");

         // Prompt the user for the second number.
         System.out.println("\n Please enter the second number in this space: ");
         int num2 = scanner .nextInt();

         System.out.println("\n you entered: " + num2);

         System.out.println("\n\n Once you do that, you may enter your final number. \n\n");


         // Prompt the user for the final number.
         System.out.println("\n Please enter the final number: ");
         int num3 = scanner .nextInt();

         System.out.println("\n you entered: " + num3);

         System.out.println("\n The numbers are: " + num1 + num2 + num3);

     }
 }