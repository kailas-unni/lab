interface Area
{
    void area();
}
interface Volume
{
    void volume();
}
class Shape
{
    String name;
    Shape()
    {
        name = "";
    }
    void getName()
    {
        System.out.println("Shape Name : "+name);
    }
}
class Circle extends Shape implements Area
{
    double radius;
    Circle(double r, String n)
    {
        radius = r;
        name = n;
    }
    public void area()
    {
        System.out.println("Area : "+3.14*radius*radius);
    }
}
class Square extends Shape implements Area
{
    double side;
    Square(double s, String n)
    {
        side = s;
        name = n;
    }
    public void area()
    {
        System.out.println("Area : "+side*side);
    }
}
class Cube extends Square implements Volume
{
    Cube(double s, String n)
    {
        super(s,n);
        side = s;
        name = n;
    }
    public void volume()
    {
        System.out.println("Volume : "+side*side*side);
    }
}
class Sphere extends Circle implements Volume
{
    Sphere(double r, String n)
    {
        super(r,n);
        radius = r;
        name = n;
    }
    public void volume()
    {
        System.out.println("Volume : "+(4/3)*3.14*radius*radius*radius);
    }
}
class Cylinder extends Circle implements Volume
{
    double height;
    Cylinder(double h, double r, String n)
    {
        super(r,n);
        height = h;
        radius = r;
        name = n;
    }
    public void volume()
    {
        System.out.println("Volume : "+3.14*radius*radius*height);
    }
}
class Glome extends Sphere
{
    Glome(double r, String n)
    {
        super(r,n);
        radius = r;
        name = n;
    }
    public void volume()
    {
        System.out.println("Volume : "+0.5*3.14*3.14*radius*radius*radius*radius);
    }
}
class Main
{
    public static void main(String args[]) 
    {
        Circle cir = new Circle(10, "Circle");
        Square sqr = new Square(20, "Square");
        Cube cub = new Cube(10, "Cube");
        Sphere sph = new Sphere(10, "Sphere");
        Cylinder cyl = new Cylinder(10, 10, "Cylinder");
        Glome glo = new Glome(10, "Glome");
        cir.getName();
        cir.area();
        sqr.getName();
        sqr.area();
        cub.getName();
        cub.volume();
        sph.getName();
        sph.volume();
        cyl.getName();
        cyl.volume();
        glo.getName();
        glo.volume();
    }
}