// // find area circle
//  #include <stdio.h>
// int main() {
//     double pi = 3.14;   
//     int radius = 4;          
//     double area = pi * radius * radius;  
//     printf("Area of circle is:%lf\n", area);   
//     return 0;
// }

    // for diameter
    #include<stdio.h>
    int main(){
        int diameter = 25;
        float radius = diameter/2;
        float pi = 3.14;
        float area = pi * radius * radius;
        printf("Area of circle is:%.2f",area);
    }