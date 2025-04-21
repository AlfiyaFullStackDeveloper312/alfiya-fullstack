class Scratch{
   public static void main(String[]args){
       Car myCarOne = new Car();
       myCarOne.brand="audi";
       myCarOne.color="black";
       myCarOne.displayInfo();
       Car myCarTwo = new Car();
       myCarTwo.brand="bmw";
       myCarTwo.color="cream";
       myCarTwo.displayInfo();
       System.out.println("Hello Java");
   }
}
class Car {
   String brand = "----";
   int topSpeed;
   String color="white";
   int wheels;
   int enginePower;

   // Adding the missing method
  public void startEngine() {
       System.out.println("Engine started!");
   }
   public void stopEngine() {
       System.out.println("Engine stop!");
   }
   public  void displayInfo(){
      System.out.println("car brand ="+brand+"Car color="+color);
   }
}