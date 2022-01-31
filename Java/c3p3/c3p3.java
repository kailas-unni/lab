class Staff
{
    int code;
    String name;
    Staff()
    {
        code =12;
        name = "Kailas";
    }
}
class Faculty extends Staff
{
    String dept;
    String sub;
    String res;
    Faculty()
    {
        dept = "CS";
        sub = "LSD";
        res = "Cocaine";
    }
}
class Typist extends Staff
{
    String office;
    int speed;
    Typist()
    {
        office = "ABC";
        speed = 120;
    }
}
class Officer extends Staff
{
    int rank;
    char grade;
    Officer()
    {
        rank = 1;
        grade = 'A';
    }
}
class Permanent extends Typist
{
    int salary;
    Permanent()
    {
        salary = 5000000;
    }
}
class Casual extends Staff
{
    int daily;
    Casual()
    {
        daily = 50000;
    }
}
class Main
{
    public static void main(String arg[]) {
        Casual obj1 = new Casual();
        Permanent obj2 = new Permanent();
        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}