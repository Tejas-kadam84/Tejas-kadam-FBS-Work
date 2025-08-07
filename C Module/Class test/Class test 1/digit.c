//Que 3. Print last 2 digit of number.
//Eg. i/p: 223410
//o/p: 10
#include <stdio.h>
void main()
{
	int a=223410;
	int b=a%10;
	int c=a/10;
	int d=c%10;
	
	printf("%d%d",d,b);
}