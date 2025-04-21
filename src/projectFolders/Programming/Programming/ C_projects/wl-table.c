// Multiplication table using while loop ,ask the user for a number
#include<stdio.h>
int main(){
    int num ;
    int i =1;
    printf("Enter the number:");
    scanf("%d",&num);
    printf("Table of %d:\n",num);
    while (i<=10)
    {
       printf("%d\n",num *i);
       i++;
    }
    
}
 
    