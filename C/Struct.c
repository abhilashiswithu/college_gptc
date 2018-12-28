#include<stdio.h>
struct Stud
{
	char name[20];
	int reg;
	char brnch[10];
	char class[10];
	int roll;
	char dob[10];
};
void main()
{
	int n,i;
	printf("\nPlease enter the number of students to input their details.\n");
	scanf("%d",&n);
	struct Stud sud[n];
	for(i=0;i<n;i++)
	{
		printf("\nPlease enter the details of STUDENT '%d'.\n\n",(i+1));
		printf("Enter the name.\n");
		scanf("%s",sud[i].name);
		printf("\nEnter the register number.\n");
		scanf("%d",&sud[i].reg);
		printf("\nEnter the branch.\n");
		scanf("%s",sud[i].brnch);
		printf("\nEnter the class.\n");
		scanf("%s",sud[i].class);
		printf("\nEnter the roll number.\n");
		scanf("%d",&sud[i].roll);
		printf("\nEnter the date of birth.\n");
		scanf("%s",sud[i].dob);
	}
	printf("\n******************************************");//42
	printf("\n            STUDENT BIODATA");
	printf("\n*******************************************\n");
	for(i=0;i<n;i++)
	{
		printf("\n===========================================");//43
		printf("\n           DETAILS OF STUDENT %d",(i+1));
		printf("\n===========================================");
		printf("\n   Name           : %s",sud[i].name);
		printf("\n   Register No.   : %d",sud[i].reg);
		printf("\n   Branch         : %s",sud[i].brnch);
		printf("\n   Class          : %s",sud[i].class);
		printf("\n   Roll No.       : %d",sud[i].roll);
		printf("\n   Date of Birth  : %s",sud[i].dob);
		printf("\n===========================================\n");
	}
}
