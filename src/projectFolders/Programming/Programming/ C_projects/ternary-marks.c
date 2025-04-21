#include<stdio.h>
int main(){
    int marks;
    printf("Enter a student marks");
    scanf("%d", & marks);
    (marks >= 85)? printf("student grade is:  A %d", marks): 
    (marks >= 75)? printf("student grade is:  B %d", marks):
    (marks >= 65)? printf("student grade is:  C %d", marks):
    (marks >= 45)? printf("student grade is:  D %d", marks):
    (marks >= 35);
    return 0;
} 