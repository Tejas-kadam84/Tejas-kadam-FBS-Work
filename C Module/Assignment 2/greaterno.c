//Write a program to find greatest of three numbers using nested if-else.
#include<stdio.h>
void main()
{
	int a,b,c;
	printf("enter the three number");
	scanf("%d", &a);
	
	printf("enter the three number");
	scanf("%d", &b);
	
	printf("enter the three number");
	scanf("%d", &c);
	if(a>b)
	{
		if(a>c){
			printf("greater is a");
		}
		else
		{
			printf("greater is c");
		}}
		else if(b>c){
		{
			printf("greater is b");
		}}
		else
		{
			printf("greater is c");
		}
}

