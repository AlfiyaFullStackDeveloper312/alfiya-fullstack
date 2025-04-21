 #include <stdio.h>
#include <stdlib.h>

int main()
{
    int num;
    printf("Enter the number: ");
    scanf("%d", &num);

    if ((num & 1) == 0)  // Corrected condition
    {
        printf("Number is even.\n");
    }
    else
    {
        printf("Number is odd.\n");
    }
    return 0;
}