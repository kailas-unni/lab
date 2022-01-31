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
  name="";
 }
 void getName()
 {
  System.out.println(name);
 }
}

class Circle extends Shape implements Area
{
 double radius;
 Circle()
 {
  radius=0;
 }
 Circle(double r,String n)
 {
  name=n;
  radius=r;
 }
  void area()
 {
  System.out.println("AREA :"+3.14*radius*radius);
 }
}

class Square extends Shape implements Area
{
 double side;
 Square()
 {
  side=0;
 }
 Square(double s,String n)
 {
  side=s;
  name=n;
 }
  void area()
 {
  System.out.println("AREA : "+side*side);
 }
}

class Cylinder extends Circle implements Volume
{
 double height;
 Cylinder(double h,double r,String n)
 {
  height=h;
  radius=r;
  name=n;
 }
  void volume()
 {
  System.out.println("VOLUME : "+3.14*radius*radius*height);
 }
}

class Sphere extends Circle implements Volume
{
 Sphere()
 {
  radius=0;
 }
 Sphere(double r,String n)
 {
  radius =r;
  name=n;
 }
  void volume()
 {
  System.out.println("VOLUME : "+1.33*3.14*radius*radius*radius);
 }
}

class Cube extends Square implements Volume
{
 Cube(double s,String n)
 {
  name=n;
  side=s;
 }
  void volume()
 {
  System.out.println("VOLUME : "+side*side*side);
 }
}

class Glome extends Sphere implements Volume
{
 Glome(double r,String n)
 {
  name=n;
  radius=r;
 }
  void volume()
 {
  System.out.println("VOLUME : "+.5*3.1*3.14*radius*radius*radius*radius);
 }
}

class aandv
{
 public static void main(String arg[])
 {
  Circle sh1 = new Circle(10.0,"CIRCLE");
  Square sh2 = new Square(10.0,"SQUARE");
  Cylinder sh3 = new Cylinder(10.0,20.0,"CYLINDER");
  Sphere sh4 = new Sphere(10.0,"SPHERE");
  Cube sh5 = new Cube(10.0,"CUBE");
  Glome sh6 = new Glome(10.0,"GLOME");
  sh1.getName();
  sh1.area();
  sh2.getName();
  sh2.area();
  sh3.getName();
  sh3.volume();
  sh4.getName();
  sh4.volume();
  sh5.getName();
  sh5.volume();
  sh6.getName();
  sh6.volume();
 }
 

}