#include<stdio.h>
int main(){
int originalprice;
int sellingprice;
printf("Enter the original price:");
scanf("%d",&originalprice);
printf("Enter the selling price:");
scanf("%d",&sellingprice);
 if(originalprice<sellingprice){
printf("its a profit");
 }else{
    printf("not a profit");
 }
};



//  int discount1 = (totalamount * 30) / 100;
//     int discount2 = totalamount * 0.05;
//     if (totalamount >= 5000 && strcmp(member, input) == 0)
//     {
//         int finalamount = totalamount - discount1;
//         printf("You are a member\n");
//         printf("your total amount %d\n",totalamount);
//         printf("You get a 30 percent discount: %d\n", discount1);
//         printf("Final amount after discount: %d\n", finalamount);
//     }
//     else
//     {
//         int finalamount = totalamount - discount2;
//         printf("You are not a member\n");
//         printf("your total amount %d\n",totalamount);
//         printf("You get a 5 percent discount: %d\n", discount2);
//         printf("Final amount after discount: %d\n", finalamount);
//     }
//     return 0;
// }