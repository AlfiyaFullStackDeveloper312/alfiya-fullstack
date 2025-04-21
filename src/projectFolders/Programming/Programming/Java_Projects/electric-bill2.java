import java.util.Scanner;
class Scratch {
   public static void main(String[] args) {
       Scanner number = new Scanner(System.in);
       System.out.println("Enter electrical units: ");
       int units = number.nextInt();
       int billAmount = 0;

       if (units <= 50) {
           billAmount = units * 7;
       } else if (units >=51|| units <=150 ){
           billAmount = units *8 ;

       } else if (units <=151|| units <=250 ){
           billAmount = units *12 ;

       } else if (units >=251 ){
           billAmount = units *8;
       }
       int additionalCharge= (billAmount*20)/100;
       int total=additionalCharge+billAmount;
       System.out.println("Electrical charges before(Additional charge):"+billAmount);
       System.out.println("Additional Charge(20%):"+additionalCharge);
       System.out.println("The electrical bill amount (with additional charge): " + total);
       number.close();
   }
}