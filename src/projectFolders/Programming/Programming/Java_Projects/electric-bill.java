import java.util.Scanner;
class Scratch {
   public static void main(String[] args) {
       Scanner userAmount = new Scanner(System.in);
       System.out.println("Enter your unit:");
       int unit = userAmount.nextInt();
               int billAmount=0;
       if(unit<=50){
           billAmount=unit*7;
       } else if (unit>=51||unit<=150) {
           billAmount =unit * 8;
       } else if (unit<=151||unit<=250) {
           billAmount =unit *12;
       }else {
           billAmount=unit*15;

           int  addtionalCharge= (billAmount*20)/100;
           int total=addtionalCharge+billAmount;
           System.out.println("your bill is"+billAmount);
           System.out.println("The electrical bill amount with additionalCharges is: " + total);
       }

   }

}