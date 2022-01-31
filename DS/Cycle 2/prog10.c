#include<stdio.h>
int queue[20];
int front=-1, rear=-1, size;
void enqueue(int data)
{
    if((rear==size-1)&&(front==0) || front==rear+1)
    {
        printf("Overflow!!\n");
    }
    else 
    {
        if(front==-1 && rear==-1)
        {
            front = 0;
            rear = 0;
        }
        else if(rear==size-1 && front!=0)
        {
            rear=0;
        }
        else
        {
            rear = (rear+1);
        }
        queue[rear]=data;
    }
}
void deque()
{
    int data;
    if(front==-1 && rear==-1)
    {
        printf("Underflow!!\n");
    }
    else
    {
        data = queue[front];
        if(front==rear)
        {
            front = -1;
            rear = -1;
        }
        else if(front==size-1)
        {
            front=0;
        }
        else
        {
            front= front+1;
        }
        printf("Deleted Data : %d\n", data);
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
        printf("Queue is : ");
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
    printf("Enter the size of Queue : ");
    scanf("%d", &size);
    int catch,n;
    do
    {
        printf("\n\nMENU\n1.Enqueue\n2.Deqeue\n3.Display\n0.Exit");
        printf("\nEnter the value : ");
        scanf("%d",&catch);
        switch (catch)
        {
        case 1:
            printf("Enter data : ");
            scanf("%d", &n);
            enqueue(n);
            display();
            break;
        case 2:
            deque();
            display();
            break;
        case 3:
            display();
            break;
        case 0:
            break;
        default:
            printf("Invalid Choice!!");
            break;
        }
    } while (catch);
    
}