#include<stdio.h>
int main(){
    int number;
    printf("enter a number");
    scanf("%d", & number);
    for(number = 1; number <= 10; number ++){
        printf("%d",number);
    }
    return 0;
} 