import Foundation
print("Enter the first number:")
guard let input1 = readLine()else{
    print("Invalid input")
    exit(0)
}
print("Enter the second number:")
guard let input2 = readLine()else{
    print("Invalid input")
    exit(0)
}
//  guard let number1 = int(input), let number2 = int(input)else{
//      print("Enter valid number.")
//      exit(0)
//  } 