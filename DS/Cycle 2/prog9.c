#include<stdio.h>
int arr[20];
int front=-1, rear=-1, size;
void enqueue(int data)
{
    if(rear==size-1)
    {
        printf("Queue is Full!!");
    }
    else
    {
        rear = rear+1;
        arr[rear] = data;
        if(front==-1)
            front = front+1;
    }
}
void deque()
{
    int data;
    if(front==-1 && rear==-1)
    {
        printf("Queue is empty!!");
    }
    else
    {
        data = arr[front];
        printf("Deleted data : %d\n", data);
        if(front == rear)
        {
            front = -1;
            rear =-1;
        }
        else
        {
            front=front+1;
        }
    }
}
void display()
{
    if(front==-1)
    {
        printf("\nQueue is Empty!!");
    }
    else
    {
        printf("\nQueue is\n");
        for(int i=front;i<=rear;i++)
        {
            printf("%d\t", arr[i]);
        }
    }
}
void main()
{
    int catch,n;
    printf("Enter the size of Queue : ");
    scanf("%d", &size);
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