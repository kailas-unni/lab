class Employee
{
    String name, adr;
    int age, phno, sal;
    Employee(String n, int a, int ph, String ad, int s)
    {
        name = n;
        age = a;
        phno = ph;
        adr = ad;
        sal = s;
    }
    void printSalary()
    {
        System.out.println("Salary : "+sal);
    }
}
class Officer extends Employee
{
    String specialization;
    Officer(String n, int a, int ph, String ad, int s, String sp)
    {
        super(n,a,ph,ad,s);
        specialization = sp;
    }
}
class Manager extends Employee
{
    String dept;
    Manager(String n, int a, int ph, String ad, int s, String dp)
    {
        super(n,a,ph,ad,s);
        dept = dp;
    }
}
class Main
{
    public static void main(String arg[])
    {
        Officer obj1 = new Officer("Kailas",19,9494784,"North Paravur",25000,"PHD");
        Manager obj2 = new Manager("Athul",19,9494784,"North Paravur",55000,"MATHS");
        System.out.println(obj1.name);
        System.out.println(obj2.name);
        System.out.println(obj1.specialization);
        System.out.println(obj2.dept);
    }
}
