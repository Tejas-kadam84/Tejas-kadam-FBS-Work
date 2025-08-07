//Que 2. WAP to check if number is positive, negative or neutral (0).
#include<stdio.h>
void main()
{
	int num;
	
	printf("enter the number:");
	scanf("%d", &num);
	
	if(num>0)
	{
		printf("number is positive");
	}
	else if(num<0)
	{
		printf("number is negative");
	}
	else
	{
		printf("number is neutral");
	}
	
}