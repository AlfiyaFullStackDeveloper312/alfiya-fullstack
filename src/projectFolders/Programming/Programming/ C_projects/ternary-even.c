// use the ternary operator to check if a number is even.
#include <stdio.h>
int main()
{
    int number;
    printf("Enter the number:");
    scanf("%d", &number);
     (number % 2 == 0)? printf("This number is even %d", number): printf("this number is odd %d", number);
    return 0;
}
