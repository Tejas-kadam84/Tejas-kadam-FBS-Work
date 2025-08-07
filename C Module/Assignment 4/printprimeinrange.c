#include<stdio.h>
void main() {
	int no;
	printf("enter the range:");
	scanf("%d",&no);
	for(int k=2; k<=no; k++) {

		int num=k;
		int isprime=1;
//	printf("Enter the number:");
//	scanf("%d",&num);

//


		for(int i=2; i<=num/2; i++) {
			if(num%i==0)
				isprime=0;
		}

		if(isprime==1) {
			printf("%d \n",k);
		} //else {
		//	printf("Not prime");
		//}
	}

}