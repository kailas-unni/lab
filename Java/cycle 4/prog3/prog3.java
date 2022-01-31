interface Operations
{
    void area();
    void volume();
    double PI = 3.14;
}
class Cylinder implements Operations
{
    double height, radius;
    Cylinder(double h, double r)
    {
        height = h;
        radius = r;
    }
    public void area()
    {
        System.out.println("Area : "+((2*PI*radius*height)+(2*PI*radius*radius)));
    }
    public void volume()
    {
        System.out.println("Volume : "+PI*radius*radius*height);
    }
}
class Main
{
    public static void main(String args[]) 
    {
        Cylinder obj = new Cylinder(10,20);    
        obj.area();
        obj.volume();
    }
}