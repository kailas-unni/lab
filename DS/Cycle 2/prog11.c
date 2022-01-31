#include<stdio.h>
int rear=-1, front=-1, size;
struct queue
{
    int data;
    int priority;
}que[20];
void enqueue(int n)
{
    int value,p;
    while(n)
    {
        if(rear==size-1)
        {
            printf("Queue is Full!!");
        }
        else
        {
            rear=rear+1;
            printf("Enter data     : ");
            scanf("%d", &value);
            printf("Enter priority : ");
            scanf("%d", &p);
            que[rear].data = value;
            que[rear].priority = p;
            if(front==-1)
                front=front+1;
        }
        n--;
    }
}
void sort()
{
    struct queue temp;
    for(int i=front;i<=rear;i++)
    {
        for(int j=front;j<=rear;j++)
        {
            if(que[j].priority<que[j+1].priority)
            {
                temp = que[j];
                que[j] = que[j+1];
                que[j+1] = temp;
            }
        }
    }
}
void deque()
{
    struct queue data;
    if(front==-1)
    {
        printf("Queue is empty!!");
    }
    else
    {
        data = que[front];
        printf("Deleted Element : %d\nPriority : %d\n", data.data, data.priority);
        if(front==rear)
        {
            front = -1;
            rear = -1;
        }
        else
        {
            front+=1;
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
            printf("\nData : %d    Priority : %d", que[i].data, que[i].priority);
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
            printf("Enter the number of data : ");
            scanf("%d", &n);
            enqueue(n);
            display();
            sort();
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