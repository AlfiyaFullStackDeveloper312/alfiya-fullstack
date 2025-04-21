//  convert a given temperature from celsius to fahrenheit only if its greater then 0 degree c,otherwise print "too cold"
#include <stdio.h>
int main()
{
    int tc;
    printf("enter the temperature:");
    scanf("%d", &tc);
    int tf = tc * 1.8 + 32;
    (tc > 0) ? printf("temperature in fahrenheit : %d", tf) : printf("too cold");
    return 0;
}
