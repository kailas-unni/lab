#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node* link;
};
struct node* head = NULL;

void display()
{
    struct node* temp;
    if(head == NULL)
    {
        printf("\nList is empty");
    }
    else
    {
        printf("\nList is : ");
        temp = head;
        while(temp!=NULL)
        {
            printf("%d  ",temp->data);
            temp = temp->link;
        }
    }
}

void insbeg()
{
    struct node* new;
    new = malloc(sizeof(struct node));
    printf("\nEnter data : ");
    scanf("%d",&new->data);
    new->link = head;
    head = new;     
}

void insend()
{
    struct node *new, *temp;
    new = malloc(sizeof(struct node));
    printf("\nEnter data : ");
    scanf("%d",&new->data);
    new->link = NULL;
    temp = head;
    while(temp->link!=NULL)
    {
        temp = temp->link;
    }
    temp->link = new;
}

void inspos()
{
    struct node *new, *temp;
    int pos, i=1;
    new = malloc(sizeof(struct node));
    printf("\nEnter position : ");
    scanf("%d", &pos);
    printf("Enter data : ");
    scanf("%d", &new->data);
    temp = head;
    while(i!=pos-1)
    {
        temp = temp->link;
        i++;
    }
    new->link = temp->link;
    temp->link = new;
}

void delbeg()
{
    struct node *temp;
    if(head == NULL)
    {
        printf("\nList is empty");
    }
    else
    {
        temp = head;
        head = head->link;
        free(temp);
    }
}

void delend()
{
    struct node *temp, *prev;
    if(head == NULL)
    {
        printf("\nList is empty");
    }
    else
    {
        temp = head;
        while(temp->link!=NULL)
        {
            prev = temp;
            temp = temp->link;
        }
        prev->link = NULL;
        free(temp);
    }
}

void delpos()
{
    struct node *temp, *prev;
    int pos, i=1;
    if(head == NULL)
    {
        printf("\nList is empty");
    }
    else
    {
        printf("\nEnter position : ");
        scanf("%d", &pos);
        temp = head;
        while(i!=pos-1)
        {
            prev = temp;
            temp = temp->link;
            i++;
        }
        prev->link = temp->link;
        free(temp);
    }
}

void main()
{
    int ch;
    do
    {
        printf("\n--------------MENU-------------\n"
               "1.Display\n"
               "2.Insert at Begining\n"
               "3.Insert at End\n"
               "4.Insert at specific Position\n"
               "5.Delete at Front\n"
               "6.Delete at End\n"
               "7.Delete at Specific position\n"
               "0.Exit\n"
               "Enter your choice : ");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            display();
            break;
        case 2:
            insbeg();
            break;
        case 3:
            insend();
            break;
        case 4:
            inspos();
            break;
        case 5:
            delbeg();
            break;
        case 6:
            delend();
            break;
        case 7:
            delpos();
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