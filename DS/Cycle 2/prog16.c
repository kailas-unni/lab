#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *link;
};

struct node *new, *front, *rear, *top;

void createNode()
{
    new = (struct node *)malloc(sizeof(struct node *));
    return;
}

void enque(int el)
{
    createNode();
    if ((front == NULL) && (rear == NULL))
    {
        front = new;
        rear = new;
        rear->data = el;
        rear->link = NULL;
    }
    else
    {
        rear->link = new;
        rear = new;
        rear->data = el;
        rear->link = NULL;
    }
}

int deque()
{
    int it;
    it = front->data;
    struct node *temp = front;
    front = front->link;
    free(temp);
    return it;
}

void push(int el)
{
    createNode();
    new->data = el;
    new->link = top;
    top = new;
}

int pop()
{
    int it;
    struct node *ptr = top;
    it = ptr->data;
    top = ptr->link;
    free(ptr);
    return it;
}

void display()
{
    struct node *ptr = front;
    while (ptr != NULL)
    {
        printf("%d   ", ptr->data);
        ptr = ptr->link;
    }
}

int main()
{
    int l = 0, elem;
    char ch;
    do
    {
        printf("Enter the queue element:");
        scanf("%d", &elem);
        enque(elem);
        l++;
        printf("\nEnter y OR n:");
        scanf(" %c", &ch);
    } while (ch != 'n');
    printf("\nQueue:  ");
    display();
    for (int i = 1; i <= l; i++)
    {
        push(deque());
    }
    for (int i = 1; i <= l; i++)
    {
        enque(pop());
    }
    printf("\nQueue reverse:  ");
    display();
    return 0;
}