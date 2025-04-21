// Even number :Use a while loop to print all even numbers from 1 to 20;
#include<stdio.h>
int main(){
    int n =1 ;
     while (n <= 20) {         
        if (n % 2 == 0) {    
            printf("%d\n Even numbers are:", n);  
        }
        n++;  
    }
    return 0;
}
    