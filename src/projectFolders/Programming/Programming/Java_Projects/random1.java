import java.util.Scanner;
import java.util.Random;
class Scratch {
   public static void main(String[] args) {
       Random random = new Random();
       Scanner scanner = new Scanner(System.in);
       int num1 = random.nextInt(10);
       int num2 = random.nextInt(10);
       System.out.println("Enter first number:"+num1);
       System.out.println("Enter first number:"+num2);
       int correctAnswer = num1 * num2;
       System.out.println("Enter your answer:");
       int userAnswer = scanner.nextInt();
       if(userAnswer == correctAnswer){
           System.out.println("It is correct!");
       }else{
           System.out.println("It is not correct. The correct answer is: " + correctAnswer);
       }
   }
}