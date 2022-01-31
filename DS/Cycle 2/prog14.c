#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *link;
};
struct node *top = NULL;

void display()
{
    if(top == NULL)
    {
        printf("\nStack is Empty!!");
    }
    else
    {
        struct node *temp;
        temp = malloc(sizeof(struct node));
        printf("\nStack is : TOP");
        temp = top;
        while(temp!=NULL)
        {
            printf(" <- %d ", temp->data);
            temp = temp->link;
        }
    }
}

void push()
{
    struct node *new;
    new = malloc(sizeof(struct node));
    printf("\nEnter data : ");
    scanf("%d", &new->data);
    new->link = top;
    top=new;
    display();
}

void pop()
{
    if(top == NULL)
    {
        printf("\nStack underflow");
    }
    else
    {
        struct node *temp;
        temp = top;
        top=temp->link;
        // Doubt temp->link=NULL
        free(temp);
        display();
    }
}

void main()
{
    int ch;
    do
    {
        printf("\n--------------MENU-------------\n"
               "1.Push\n"
               "2.Pop\n"
               "3.Display\n"
               "0.Exit\n"
               "Enter your choice : ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            push();
            break;
        case 2:
            pop();
            break;
        case 3:
            display();
            break;
        case 0:
            exit(0);
            break;
        default:
            printf("Incorrect Choice!!\n");
            break;
        }
    }while(ch);
}