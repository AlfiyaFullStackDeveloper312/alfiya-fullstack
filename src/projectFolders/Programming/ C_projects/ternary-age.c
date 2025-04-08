#include<stdio.h>
int main(){
int age;
printf("Enter your age");
scanf("%d", & age);
(age >= 18) ? printf("Your eligible for vote %d", age): printf("Your not eligible for vote %d", age);
return 0;
}