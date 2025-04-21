import java.util.Random;
import java.util.Scanner;

class Scratch {
   public static void main(String[] args) {
       Random rand = new Random(); // Using the same Random object
Scanner inputNumber = new Scanner(System.in);
       int num1 = generateRandomNumber(rand);
       int num2 = generateRandomNumber(rand);
       int correctAnswer = num1 * num2;

       System.out.println("First number: " + num1);
       System.out.println("Second number: " + num2);

       // Taking user input
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter your answer: ");
       int userAnswer = scanner.nextInt();
       // Checking if the answer is correct
       if (userAnswer == correctAnswer) {
           System.out.println("This is correct");
       } else {
           System.out.println("This is incorrect. The correct answer is: " + correctAnswer);
       }

       scanner.close();
   }
   public static int generateRandomNumber(Random rand) {
       return rand.nextInt(10) ;  // Generates a random number between 1 and 10
   }
}