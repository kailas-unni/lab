#include<stdio.h>
#include<stdlib.h>

void enqueue_front(int);
void enqueue_rear(int);
void dequeue_front();
void dequeue_rear();
void display();
int dequeue[20],front=-1,rear=-1,N;

int main()
{
    int x,ch,n;
    printf("Enter the size of the queue: ");
    scanf("%d",&n);
    N=n;
    while(1)
    {
        printf("\nEnter 1 for entering elements in the front\nEnter 2 for entering elements from rear\nEnter 3 to delete elements from front\nEnter 4 to delete elements from rear\nEnter 5 to display\nEnter 6 to exit ");
        scanf("%d",&ch);
        switch(ch)
        {
        case 1:
            {
                printf("Enter the element to be entered: ");
                scanf("%d",&x);
                enqueue_front(x);
                break;
            }
        case 2:
            {
                printf("Enter the element to be entered: ");
                scanf("%d",&x);
                enqueue_rear(x);
                break;
            }
        case 3:
            {
                dequeue_front();
                break;
            }
        case 4:
            {
                dequeue_rear();
                break;
            }
        case 5:
            {
                display();
                break;
            }
        case 6:
            {
                exit(0);
            }
        default:
            {
                printf("Wrong choice!!");
            }
        }
    }
    return 0;
}


void enqueue_front(int x)
{
    if(front==-1)
    {
        //printf("Not possible!!");
        front=0;
        rear=0;
        dequeue[front]=x;
    }
    else if(front>=0)
    {
        front--;
        dequeue[front]=x;
    }
    else
    {
         printf("Not possible!!");
    }
    display();
}

void enqueue_rear(int x)
{
    if(rear==N-1)
    {
        printf("Not possible!!");
    }
    else
    {
        if(rear==-1)
        {
            rear=0;
            dequeue[rear]=x;
        }
        else
        {
            rear++;
            dequeue[rear]=x;
        }
        if(front==-1)
        {
            front=0;
        }
    }
    display();
}

void dequeue_front()
{
    int n;
    if(front==-1)
    {
        printf("Not possible!!");
    }
    else
    {
        n=dequeue[front];
        if(front==rear)
        {
            front=-1;
            rear=-1;
        }
        else
        {
            front++;

        }
        printf("The deleted element is %d",n);
    }
    display();
}

void dequeue_rear()
{
    int n;
    n=dequeue[rear];
    if(front==-1)
    {
        printf("Not possible");
    }
    else
    {
      if(front==rear)
      {
        front=-1;
        rear=-1;
      }
      else
      {
          rear--;
      }
      if(rear=-1)
          {
              front=-1;
          }
      printf("The element deleted is :%d",n);
    }
    display();
}

void display()
{
    int i;
    if((front==-1)&&(rear==-1))
    {
        printf("Underflow!!");
    }
    else
    {
        printf("\nThe queue elements are:\n");
        if(rear>=front)
        {
            for(i=front;i<=rear;i++)
            {
                printf("%d\t",dequeue[i]);
            }
        }
        else
        {
            for(i=0;i<=rear;i++)
            {
                printf("%d\t",dequeue[i]);
            }
            for(i=front;i<N;i++)
            {
                printf("%d\t",dequeue[i]);
            }
        }
    }
}