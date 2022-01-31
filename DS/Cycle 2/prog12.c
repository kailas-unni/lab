#include<stdio.h>
int queue[20];
int front=-1, rear=-1, size;
void  insrear(int data)
{
    if(rear==size-1)
    {
        printf("Overflow!!\n");
    }
    else
    {
        rear++;
        queue[rear] = data;
        if(rear==-1)
        {
            rear=0;
        }
        if(front==-1)
        {
            front=0;
        }
    }
}
void insfront(int data)
{
    if(front==-1)
    {
        front=0;
        rear=0;
        queue[front]=data;
    }
    else if(front>0)
    {
        front--;
        queue[front]=data;
    }
    else
    {
          printf("Not possible!!");
    }
}
void delfront()
{
    int data;
    if(front==-1)
    {
        printf("Underflow!!");
    }
    else 
    {
        data=queue[front];
        if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else
        {
            front++;
        }
        printf("Deleted data : %d", data);
    }
}
void delrear()
{
    int data;
    if(front==-1)
    {
        printf("Underflow!!");
    }
    else
    {
        data = queue[rear];
        if(front == rear)
        {
            front = -1;
            rear = -1;
        }
        else
            rear--;
        if(rear==-1)
        {
            front=-1;
        }
        printf("Deleted data : %d", data);
    }
}
void display()
{
    int i=front;
    if(front==-1 && rear==-1)
    {
        printf("\nQueue is Empty!!");
    }
    else
    {
        printf("\nQueue is : ");
        if (rear >= front)
        {
            for (int i = front; i <= rear; i++)
                printf("%d\t",queue[i]);
        }
        else
        {
            for (int i = 0; i <= rear; i++)
                printf("%d\t", queue[i]);
            for (int i = front; i < size; i++)
                printf("%d\t", queue[i]);
        }
    }
}
void main()
{
    int catch, data;
    printf("Enter the size of Queue : ");
    scanf("%d", &size);
    do
    {
        printf("\n\nMENU\n1.Insert at front\n2.Insert at rear\n3.Delete at Front\n4.Delete at Rear\n5.Display\n0.Exit");
        printf("\nEnter choice : ");
        scanf("%d", &catch);
        switch(catch)
        {
            case 1:
                printf("Enter data : ");
                scanf("%d", &data);
                insfront(data);
                display();
                break;
            case 2:
                printf("Enter data : ");
                scanf("%d", &data);
                insrear(data);
                display();
                break;
            case 3:
                delfront();
                display();
                break;
            case 4:
                delrear();
                display();
                break;
            case 5:display();
                break;
            case 0:
                break;
            default:
                printf("Invalid Choice!!");
                break;
        }
    } while (catch);
    
}