import java.io.*;

class AgeException extends Exception
{
    AgeException(String str)
    {
        super(str);
    }
}
class Student
{
    int rollno, age;
    String name, course;
    Student(int rollno, int age, String name, String course)
    {
        this.rollno = rollno;
        this.name = name;
        this.course = course;

        try
        {
            if(age>15 && age<21)
            {
                this.age = age;
            }
            else
            {
                throw new AgeException("Age is not between 15 & 21");
            }
        }
        catch(AgeException AE)
        {
            System.out.println(AE);
        }
    }
    void display()
    {
        System.out.println("---------------------------------");
        System.out.println("Roll No. : "+ rollno);
        System.out.println("Name     : "+ name);
        System.out.println("Age      : "+ age);
        System.out.println("Course   : "+ course);
        System.out.println("---------------------------------");
    }
}

class prog7
{
    public static void main(String[] args) 
    {   
        try
        {  
            int rollno, age;
            String name, course;  
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Roll No. : ");        
            rollno = Integer.parseInt(br.readLine());
            System.out.println("Enter Name : ");
            name = br.readLine();
            System.out.println("Enter age : ");
            age = Integer.parseInt(br.readLine());
            System.out.println("Enter course : ");
            course = br.readLine();
            Student obj = new Student(rollno, age, name, course);
            obj.display();
        }
        catch(IOException E)
        {
            System.out.println(E);
        }
    }
}