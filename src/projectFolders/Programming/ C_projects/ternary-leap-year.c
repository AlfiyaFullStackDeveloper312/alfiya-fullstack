// use the ternary operator to determine if a year is a leap year
#include <stdio.h>
int main()
{
    int year;
    printf("enter the year:");
    scanf("%d", &year);
    (year % 4 == 0) ? printf("This is a leaf year: %d", year) : (year % 100 != 0) ? printf("This is not a leaf year")
                                                                                  : (year % 400 == 0);
  return 0 ;
}