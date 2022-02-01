import java.io.*;

class SalesException extends Exception
{
    SalesException(String str)
    {
        super(str);
    }
}

class Salesman
{
    String name;
    int code;
    double amount,commision;

    Salesman(String name,int code,double amount)
    {
        this.name = name;
        this.code = code;
        this.amount = amount; 

        try
        {
            if(amount<0)
            {
                throw new SalesException("Sales amount less than 0");
            }
            else
            {
                if(amount<2000)
                    commision = 0.08 * amount;
                else if(amount>=2000 && amount<=5000)
                    commision = 0.1 * amount;
                else
                    commision = 0.12 * amount;
            }
        }
        catch(SalesException SE)
        {
            System.out.println(SE);
        }
    }
    void display()
    {
        System.out.println("----------------------------------------");
        System.out.println("Name         : "+name);
        System.out.println("Code         : "+code);
        System.out.println("Sales Amount : "+amount);
        System.out.println("Commision    : "+commision);
        System.out.println("----------------------------------------");
    }
}

class prog8
{
    public static void main(String[] args) 
    {
        try
        {
            String name, ch;
            double amount;
            int code;
            boolean i=true;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            do
            {
                System.out.println("Enter Name : ");        
                name = br.readLine();
                System.out.println("Enter Code : ");
                code = Integer.parseInt(br.readLine());        
                System.out.println("Enter Sales Amount : ");
                amount = Double.parseDouble(br.readLine());
                Salesman obj = new Salesman(name, code, amount);
                obj.display();
                System.out.println("Do you want to continue (y/n) : ");
                ch = br.readLine();
                if(ch.charAt(0)=='n'||ch.charAt(0)=='N')
                {
                    i=false;
                }
            }while(i);
        }
        catch(IOException E)
        {
            System.out.println(E);
        }
    }
}