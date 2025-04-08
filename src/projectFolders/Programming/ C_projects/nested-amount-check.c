#include<stdio.h>
int main(){
    int balance = 500;
    int withdraw;
    printf("Enter withdraw amount");
    scanf("%d", & withdraw);
    if (withdraw <= balance){
      if(withdraw % 100 == 0){
       printf("Transaction Successful\n");
      }else{ 
        printf("Amount should be multiple of 100\n");
      }
    }else{
        printf("Insufficient balance\n");
    }
     return 0; 
    } 