//class Scratch {
//    public static void main(String[] args) {
////   to find the ares of circle
//        double  pi = 3.14;
//        int  radius = 2;
//        double area = pi * radius* radius;
//       System.out.println(area);
//    }
//}
//----------even odd----------------
//class Scratch {
//    public static void main(String[] args) {
//        int num = 42;
//        if (num % 2 == 0) {
//            System.out.println("This number is even:"+num);
//        }else{
//            System.out.println( "This number  is odd:"+num );
//        }
//
//    }
//}
//-----------------car------------------
//class Scratch{
//    public static void main(String[]args){
//        Car myCarOne = new Car();
//        myCarOne.brand="audi";
//        myCarOne.color="black";
//        myCarOne.displayInfo();
//        Car myCarTwo = new Car();
//        myCarTwo.brand="bmw";
//        myCarTwo.color="cream";
//        myCarTwo.displayInfo();
//        System.out.println("Hello Java");
//    }
//}
//class Car {
//    String brand = "----";
//    int topSpeed;
//    String color="white";
//    int wheels;
//    int enginePower;
//
//    // Adding the missing method
//   public void startEngine() {
//        System.out.println("Engine started!");
//    }
//    public void stopEngine() {
//        System.out.println("Engine stop!");
//    }
//    public  void displayInfo(){
//       System.out.println("car brand ="+brand+"Car color="+color);
//    }
//}
//---------------------------random--------------------------------------------------------------
//import java.util.Random;
//import java.util.Scanner;
//
//class Scratch {
//    public static void main(String[] args) {
//        Random rand = new Random(); // Using the same Random object
//Scanner inputNumber = new Scanner(System.in);
//        int num1 = generateRandomNumber(rand);
//        int num2 = generateRandomNumber(rand);
//        int correctAnswer = num1 * num2;
//
//        System.out.println("First number: " + num1);
//        System.out.println("Second number: " + num2);
//
//        // Taking user input
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your answer: ");
//        int userAnswer = scanner.nextInt();
//        // Checking if the answer is correct
//        if (userAnswer == correctAnswer) {
//            System.out.println("This is correct");
//        } else {
//            System.out.println("This is incorrect. The correct answer is: " + correctAnswer);
//        }
//
//        scanner.close();
//    }
//    public static int generateRandomNumber(Random rand) {
//        return rand.nextInt(10) ;  // Generates a random number between 1 and 10
//    }
//}
//--------------------------------
//
// -----------------------------------------
//import java.util.Scanner;
//import java.util.Random;
//class Scratch {
//    public static void main(String[] args) {
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//        int num1 = random.nextInt(10);
//        int num2 = random.nextInt(10);
//        System.out.println("Enter first number:"+num1);
//        System.out.println("Enter first number:"+num2);
//        int correctAnswer = num1 * num2;
//        System.out.println("Enter your answer:");
//        int userAnswer = scanner.nextInt();
//        if(userAnswer == correctAnswer){
//            System.out.println("It is correct!");
//        }else{
//            System.out.println("It is not correct. The correct answer is: " + correctAnswer);
//        }
//    }
//}
//----------program with do while loop,of generating a loop----------------------
//------------------------------------------------------------------------
//import java.util.Scanner;
//class Scratch {
//    public static void main(String[] args) {
//        Scanner number =new Scanner(System.in);
//        int ammout=1000;
//        while (true){
//            System.out.println(" which type of transation  you want  if you want deposite press d or else you want wilthdral press w" );
//            String type = number.nextLine();
//            if(type.equalsIgnoreCase("w")){
//                System.out.println("enter you withdral value");
//                int withdral=number.nextInt();
//                if(ammout >0 || ammout==withdral){
//                    ammout-=withdral;
//                    System.out.println("your remaining ammout  balance is "+ammout);
//
//                }else if (ammout>withdral){
//                    System.out.println("insufisent balance");
//                }
//            }else  if (type.equalsIgnoreCase("d")) {
//                System.out.println("enter your deposite  value");
//                int deposite = number.nextInt();
//                ammout += deposite;
//                System.out.println("your account  balance is " + ammout);
//            }
//            break;
//        }
//        number.close();
//    }
//}
//-------------------------electric bill-----------------------------------------
//import java.util.Scanner;
//class Scratch {
//    public static void main(String[] args) {
//        Scanner userAmount = new Scanner(System.in);
//        System.out.println("Enter your unit:");
//        int unit = userAmount.nextInt();
//                int billAmount=0;
//        if(unit<=50){
//            billAmount=unit*7;
//        } else if (unit>=51||unit<=150) {
//            billAmount =unit * 8;
//        } else if (unit<=151||unit<=250) {
//            billAmount =unit *12;
//        }else {
//            billAmount=unit*15;
//
//            int  addtionalCharge= (billAmount*20)/100;
//            int total=addtionalCharge+billAmount;
//            System.out.println("your bill is"+billAmount);
//            System.out.println("The electrical bill amount with additionalCharges is: " + total);
//        }
//
//    }
//
//}
//------------------------electric bill---------------------------------------------
//import java.util.Scanner;
//class Scratch {
//    public static void main(String[] args) {
//        Scanner number = new Scanner(System.in);
//        System.out.println("Enter electrical units: ");
//        int units = number.nextInt();
//        int billAmount = 0;
//
//        if (units <= 50) {
//            billAmount = units * 7;
//        } else if (units >=51|| units <=150 ){
//            billAmount = units *8 ;
//
//        } else if (units <=151|| units <=250 ){
//            billAmount = units *12 ;
//
//        } else if (units >=251 ){
//            billAmount = units *8;
//        }
//        int additionalCharge= (billAmount*20)/100;
//        int total=additionalCharge+billAmount;
//        System.out.println("Electrical charges before(Additional charge):"+billAmount);
//        System.out.println("Additional Charge(20%):"+additionalCharge);
//        System.out.println("The electrical bill amount (with additional charge): " + total);
//        number.close();
//    }
//}
//----------------------------password------------------------------------------
//import java.util.Scanner;
//
//class Scratch{
//    public static void main(String[] args) {
//        String correctEmail = "alfiya@gmail.com";
//        String correctPassword = "Alfiya12";
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your email: ");
//        String userEmail = scanner.nextLine();
//        System.out.print("Enter your password: ");
//        String userPassword = scanner.nextLine();
//
//        if (userEmail.equals (correctEmail) || userPassword.equals (correctPassword)) {
//            System.out.println("Login successfully");
//        } else {
//            System.out.println("Invalid email or password");
//        }
//    }
//}
///------------------------------if else even odd--------------------------------------------------
//import java.util.Scanner;
//
//  class  Scratch {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number: ");
//        int num = scanner.nextInt();
//
//        if ((num & 1) == 0) {
//            System.out.println("Number is even.");
//        } else {
//            System.out.println("Number is odd.");
//        }
//
//        scanner.close();
//    }
//}
//--------------------------ternary------------------------------------------
import java.util.Scanner;
class Scratch {
    public static  void main(String[]args){
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = number.nextInt();
        String result = (num %2 ==0)? "Even":"Odd";
            System.out.println(num + "is" + result);
       number.close();
    }
}

