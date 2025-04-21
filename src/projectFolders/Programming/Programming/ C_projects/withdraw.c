#include<stdio.h>
int main(){
char pin [5] = "1234";
int attempt;
char enteredPin [5];
for(attempt = 0; attempt <=2; attempt ++){
printf("Enter your pin :");
scanf("%s", enteredPin);
if(strcmp (enteredPin, pin) == 0){
printf("Login successful \n");
break;
}else{
printf("Invalid");
}
}
}