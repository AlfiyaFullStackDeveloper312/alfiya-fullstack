import java.util.Scanner;
class Scratch {
   public static void main(String[] args) {
       Scanner number =new Scanner(System.in);
       int ammout=1000;
       while (true){
           System.out.println(" which type of transation  you want  if you want deposite press d or else you want wilthdral press w" );
           String type = number.nextLine();
           if(type.equalsIgnoreCase("w")){
               System.out.println("enter you withdral value");
               int withdral=number.nextInt();
               if(ammout >0 || ammout==withdral){
                   ammout-=withdral;
                   System.out.println("your remaining ammout  balance is "+ammout);

               }else if (ammout>withdral){
                   System.out.println("insufisent balance");
               }
           }else  if (type.equalsIgnoreCase("d")) {
               System.out.println("enter your deposite  value");
               int deposite = number.nextInt();
               ammout += deposite;
               System.out.println("your account  balance is " + ammout);
           }
           break;
       }
       number.close();
   }
}