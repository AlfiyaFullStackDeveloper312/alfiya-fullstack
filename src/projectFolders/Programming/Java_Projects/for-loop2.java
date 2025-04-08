import java.util.Scanner;
class PrintNum{
public static void main(String[] args){
Scanner number = new Scanner(System.in);
System.out.println("Enter a number:");
int input = number.nextInt();
for ( int i = 1; i <= input; i++){
System.out.println( + i);
}
}
}