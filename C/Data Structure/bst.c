#include<stdio.h>
#include<stdlib.h>
#include<malloc.h>
int ch,f;
struct node
{
	int data;
	struct node *left;
	struct node *right;
}*root=NULL,*tree=NULL,*new=NULL,*temp=NULL;
void insert();
void preorder(struct node *);
void inorder(struct node *);
void postorder(struct node *);
void main()
{
	printf("\n\tMENU\n\n1.Insertion\n2.Preorder\n3.Inorder\n4.Postorder\n5.Exit");
	do{
		printf("\n\nEnter your choice:\t");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
					insert();
					break;
			case 2:
					printf("\nTraversing Binary Tree in Preorder :\t");
					preorder(root);
					break;
			case 3:
					printf("\nTraversing Binary Tree in Inorder :\t");
					inorder(root);
					break;
			case 4:
					printf("\nTraversing Binary Tree in Postorder :\t");
					postorder(root);
					break;
			case 5:
					printf("\n\t***Thankyou***\n");
					break;
		}
	}while(ch!=5);
}
void insert()
{
	new=malloc(sizeof(struct node));
	printf("\nEnter the element:\t");
	scanf("%d",&new->data);
	new->left=new->right=NULL;
	tree=root;
	if(root==NULL)
	{
		root=new;
	}
	else
	{
		while(tree!=NULL)
		{
			temp=tree;
			if(new->data<tree->data)
			{
				f=0;
				tree=tree->left;
			}
			else
			{
				f=1;
				tree=tree->right;
			}
		}
		if(f==0)
		{
			temp->left=new;
		}
		else
		{
			temp->right=new;
		}
	}
}
void preorder(struct node *root)
{
	if(root==NULL)
	return; 
	printf("%d\t",root->data);
	preorder(root->left);
	preorder(root->right);
}
void inorder(struct node *root)
{
	if(root==NULL)
	return;
	inorder(root->left);
	printf("%d\t",root->data);
	inorder(root->right);
}
void postorder(struct node *root)
{
	if(root==NULL)
	return;
	postorder(root->left);
	postorder(root->right);
	printf("%d\t-",root->data);
}
