#include<stdio.h>
struct Student
{
	char name[20];
	int reg;
	char cls[10];
	int roll;
	char dob[10];
	char brnch[10];
};
void main(void)
{
	int n,i,j;
	printf("\nPlease enter the number of students to input their details.\n");
	scanf("%d",&n);
	struct Student stud[n];
	for(i=0;i<n;i++)
	{
		printf("\nPlease enter the details of STUDENT '%d'.\n\n",(i+1));
		printf("Enter the name.\n");
		scanf("%s",stud[i].name);
		printf("\nEnter the register number.\n");
		scanf("%d",&stud[i].reg);
		printf("\nEnter the class.\n");
		scanf("%s",stud[i].cls);
		printf("\nEnter the roll number.\n");
		scanf("%d",&stud[i].roll);
		printf("\nEnter the date of birth.\n");
		scanf("%s",stud[i].dob);
		printf("\nEnter the branch.\n");
		scanf("%s",stud[i].brnch);
	}
	printf("\n******************************************");//42
	printf("\n            STUDENT BIODATA");
	printf("\n*******************************************\n");
	for(j=0;j<n;j++)
	{
		printf("\n===========================================");//43
		printf("\n           DETAILS OF STUDENT %d",(j+1));
		printf("\n===========================================");
		printf("\n   Name           : %s",stud[j].name);
		printf("\n   Register No.   : %d",stud[j].reg);
		printf("\n   Class          : %s",stud[j].cls);
		printf("\n   Roll No.       : %d",stud[j].roll);
		printf("\n   Date of Birth  : %s",stud[j].dob);
		printf("\n   Branch         : %s",stud[j].brnch);
		printf("\n===========================================\n");
	}
}
