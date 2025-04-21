#include <stdio.h>
int main() {
    int age;
    printf("Enter your age: ");
    scanf("%d", &age);
    
    if (age >= 18) {
        printf("You are eligible: %d\n", age);
    } else {
        printf("You are not eligible: %d\n", age);   
    }
    return 0;
}