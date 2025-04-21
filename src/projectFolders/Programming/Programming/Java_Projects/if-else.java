import java.util.Scanner;

 class  Scratch {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the number: ");
       int num = scanner.nextInt();

       if ((num & 1) == 0) {
           System.out.println("Number is even.");
       } else {
           System.out.println("Number is odd.");
       }

       scanner.close();
   }
}