#include<stdio.h>
#include<stdlib.h>
struct Node
{
    int data;
    struct Node* link;
};
void insert_beginning(struct Node* head)
{
      struct Node *new=malloc(sizeof(struct Node));
      printf("enter the data:");
      scanf("%d",&new->data);
      if(head->link==NULL)
      {
            head->link=new;
            new->link=NULL;
            
      }
      else
      {
            struct Node* temp;
            temp=head->link;
            head->link=new;
            new->link=temp;
      }
      printf("inserted:%d",new->data);
}
void insert_end(struct Node* head)
{
      struct Node* ptr;
      ptr=head->link;
      struct Node *new=malloc(sizeof(struct Node));
      printf("enter the data:");
      scanf("%d",&new->data);
      while(ptr->link!=NULL)
      {
            ptr=ptr->link;
      }    
      ptr->link=new;
      new->link=NULL;
      printf("inserted:%d",new->data);
}
void insert_position(struct Node* head)
{
      struct Node *new, *temp;
      int pos, i=1;
      new = malloc(sizeof(struct Node));
      printf("\nEnter position : ");
      scanf("%d", &pos);
      printf("Enter data : ");
      scanf("%d", &new->data);
      temp = head;
      while(i!=pos)
      {
            temp = temp->link;
            i++;
      }
      new->link = temp->link;
      temp->link = new;
}
void delete_beginning(struct Node* head)
{
      int data;
      struct Node* temp;
      temp=head->link;
      data=temp->data;
      head->link=temp->link;
      printf("\nremoved data:%d",data);

}
void delete_end(struct Node* head)
{
      int data;
      struct Node* temp;
      struct Node* ptr;
      ptr=head->link;
      while(ptr->link!=NULL)
      {
            temp=ptr;
            ptr=ptr->link;
      }
      data=ptr->data;
      temp->link=NULL;
      printf("\nremoved data:%d",data);
}
void delete_position(struct Node* head)
{
  
}
void display(struct Node* head)
{
      struct Node* ptr;
      ptr=head->link;
      printf("\ndata present:\n");
      while(ptr->link!=NULL)
      {
            printf("%d ",ptr->data);
            ptr=ptr->link;
      }
      printf("%d \n",ptr->data);
}
int main()
{
      struct Node *head=malloc(sizeof(struct Node));
      head->link=NULL;
      int option;
      char ch;
      do{
            printf("\nLinked List operation\n");
            printf("1.Display\n2.Insert at Beginning\n3.Insert at End\n4.Insert at a Specified Position\n");
            printf("5.Delete from Beginning\n6.Delete from End\n7.Delete from a Specified Position\n8.Exit Program\n\n");
            printf("Enter Your Choice : \n");
            scanf("%d",&option);
            if (option==1)
            {
                  display(head);
            }
            
            else if(option==2)
            {
                  insert_beginning(head);
                  display(head);
            }    
            else if(option==3)
            {
                  insert_end(head);
                  display(head);
            }    
            else if(option==4)
            {
                  insert_position(head);
                  display(head); 
            }        
            else if(option==5)
            {
                  delete_beginning(head); 
                  display(head);
            }     
            else if(option==6)
            {
                  delete_end(head);
                  display(head);
            }    
            else if(option==7)
            {
                  delete_position(head);
                  display(head);
            }
            else if(option==8)
            {
                  display(head);
            }
            else
                  break;
            printf("do you wish to continue y/n");
            getchar();
            scanf("%c",&ch);
    }while(ch=='y');
    return 0;
}