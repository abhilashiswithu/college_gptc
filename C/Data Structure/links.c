#include<stdio.h>
#include<stdlib.h>
 struct node
{
int data;
struct node *link;
}*new=NULL;
int ch,top;
void main()
 {
 void push();
void pop();
void show();
printf("\t\t menu\n 1.push\n 2.pop\n 3.show 4.exit\n");
do
  {
   printf("enter choice:\t");
   scanf("%d",&ch);
switch(ch)
 {
  case 1:
   push();
   break;
  case 2:
    pop();
   break;
  case 3:
    show();
   break;
}
}
while(ch!=4);
}
void push()
 {
  new=malloc(sizeof(struct node));
 printf("enter data:\t");
scanf("%d",&new->data);
if(top==NULL)
 top=new;
 else
  {
  new->link=top;
   top=new;
}
}
void pop()
{
  if(top==NULL)
  printf("empty stack\n");
     else
      {
       new=top;
       printf("the deleted element is %d\n",new->data);
       top=new->link;
      }
}
void show()
  {
 if(top==NULL)
  printf("empty stack\n");
else
 {
   new=top;
   printf("stack is \t");
 while(new!=NULL)
{
 printf("%d\t",new->data);
new=new->link;
}
printf("\n");
}
}
