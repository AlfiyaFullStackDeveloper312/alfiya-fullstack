// calculate if a person is eligible for vote or not
#include<stdio.h>
int main(){
    int age;
    printf("enter the age:");
    scanf("%d",&age);
     (age>=18)? printf("you are eligible %d",age): printf("you are not eligible %d",age);
     return 0;
}