//Accept the price from user. Ask the user if he is a student (user may say y or n). If he
//is a student and he has purchased more than 500 than discount is 20% otherwise
//discount is 10%.But if he is not a student then if he has purchased more than 600
//discount is 15% otherwise there is not discount.
#include<stdio.h>
void main()
{
	double price,discount,total;
	char ch;
	printf("enter a price:");
	scanf("%lf", &price);
	
	printf("user student or not(y/n):");
	scanf(" %c", &ch);
	
	if(ch=='y'){
		printf("User is student\n");
		if(price>500){
				discount=price*0.20;
		total=price-discount;
		}
	else{
		discount=price*0.10;
		total=price-discount;
	}}else{
		printf("User not student\n");
		if(price>600){
				discount=price*0.15;
		total=price-discount;
		}else{
			printf("No Discount");
		}
	}
	
	printf("discount=%lf\n",discount);
	printf("finalprice=%lf",total);
}