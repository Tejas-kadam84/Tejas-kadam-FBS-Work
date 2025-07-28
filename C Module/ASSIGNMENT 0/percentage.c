#include<stdio.h>
void main()
{
	float sub1=10,sub2=20,sub3=30,sub4=40,sub5=50;
	float total,percentage;
	
	total = sub1+sub2+sub3+sub4+sub5;
	percentage = (total/500)*100;
	
	printf("total marks %.2f",total);
	printf("percentage %.2f",percentage); 
}