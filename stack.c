#include<stdio.h>
int s[100],ch,n,top,x,i;
void push();
void pop();
void display();
void isempty();
void isfull();
int main()
{
	top=-1;
	printf("Enter the Stack Size \n");
	scanf("%d",&n);
	printf("*---STACK OPERATIONS---*");
	printf("\n 1. PUSH \n 2. POP \n 3. DISPLAY \n 4. ISFULL \n 5. IS EMPTY \n");
	do
	{
	printf("\nEnter the Choice:\n");
	scanf("%d",&ch);
	switch(ch)
	{
	case 1: push();
		break;
	case 2: pop();
		break;
	case 3: display();
		break;
	case 4: isfull();
		break;
	case 5: isempty();
		break;
	case 6: printf("Exiting !");
	default : printf("Please Enter a Valid Choice");
	}
	}
	while(ch!=6);
	
	
}
void push()
{
	if(top==n-1)
	{
		printf("Stack Overflow");
	}
	else
	{
	printf("Enter the element to be pushed \n");
	scanf("%d",&x);
	top++;
	s[top]=x;
	}
}
void pop()
{
	if(top==-1)
	{
		printf("Stack Underflow");
	}
	else
	{
	printf("The pop element is %d \n",s[top]);
	top--;
	}
}
void display()
{
	if(top>=0)
	{
		printf("The Elements in the stack are:\n");
		for(i=top;i>=0;i--)
	
		{
		printf("\n %d",s[i]);
		}
	}
		else
		{
		printf("The Stack is empty");
		}
	
}
void isempty()
{
	if(top<0)
	{
		printf("The Stack is empty");
	}
	else
	{
		printf("The Stack is not empty");
	}
}
void isfull()
{
	if(top==n-1)
	{
		printf("\n The Stack is full \n");
	}
	else
	{
		printf("The Stack is not full");
	}
}

	

	
	
