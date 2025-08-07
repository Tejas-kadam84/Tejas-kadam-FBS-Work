//Que 1. WAP to calculate electricity bill.
//For 1-50 units – 30 rs/unit , For 51-150 units – 40 rs/unit, For 151and above units –
//50 rs/unit.

#include<stdio.h>
void main()
{
	int units;
	float bill=0;
	
	printf("enter the units:");
	scanf("%d", &units);
	
	if(units<=50)
	{
		bill=units*30;
	    
	}
	else if(units<=150)
	{
		bill=units*40;
		
	}
	else if((units>=150))
	{
		bill=units*50;
		
	}
	else
	{
		printf("invalid bill");
	}
	printf("total electricity bill %.2f", bill);
	
}