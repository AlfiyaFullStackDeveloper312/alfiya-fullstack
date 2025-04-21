
import java.util.Scanner;
class Scratch{
public static void main (String[] args){
String pin = "2003";
Scanner input = new Scanner (System.in);
for (int i = 0; i <= 2; i++){
System.out.println("Enter you pin:");
String enteredPin = input.nextLine();
if(enteredPin.equals(pin)) {
System.out.println("Login Successful!");
System.out.println("Options:");
System.out.println("Deposit enter 1");
System.out.println("Withdraw enter 2");
System.out.println("Chech balance enter 3");
int option = input.nextInt();
System.out.println("You entered option is: " + option);
break;
}else{
System.out.println("Login Unsuccessful!");
}
}
}
}