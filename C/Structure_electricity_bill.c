#include<stdio.h>
struct Electricity
{
	int cr;
	int pr;
	int unit;
	int amt;
	int num;
	char name[20];
};
void main()
{
	struct Electricity bill;
	printf("\nPlease enter your consumer number.\n");
	scanf("%d",&bill.num);
	printf("Please enter your name.\n");
	scanf("%s",bill.name);
	printf("Please enter your previous reading.\n");
	scanf("%d",&bill.pr);
	printf("Please enter your current reading.\n");
	scanf("%d",&bill.cr);
	bill.unit = bill.cr - bill.pr;
	bill.amt = 4*bill.unit; 
	{
		
		printf("\n\n___________________________________________");//43
		printf("\n|        Kerala State Electricity Board    |");
		printf("\n|__________________________________________|");//41
		printf("\n|            ELECTRICITY BILL              |");
		printf("\n|__________________________________________|");
		printf("\n| Consumer No.      : %d",bill.num);
		printf("\n| Name              : %s",bill.name);
		printf("\n| Current Reading   : %d units",bill.cr);
		printf("\n| Previous Reading  : %d units",bill.pr);
		printf("\n| Usage             : %d units",bill.unit);
		printf("\n|__________________________________________|");
		printf("\n|       Total Amount        |  Rs: %d",bill.amt);
		printf("\n|___________________________|______________|\n");//27,14
	}
}
