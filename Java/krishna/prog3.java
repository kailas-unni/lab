interface Operations 
{
 public void area();
 public void volume();
 double PI=3.14;
}

class Cylinder implements Operations
{
 double height;
 Cylinder(double h)
 {
  height=h;
 }
 public void area()
 {
  double a;
  a=(2*PI*height*height)+(2*PI*height*height);
  System.out.println("AREA :"+a);
 }
 public void volume()
 {
  System.out.println("VOLUME :"+PI*height*height*height);
 }
}

class oper
{
 public static void main(String arg[])
 {
  Cylinder c = new Cylinder(10.0);
  c.area();
  c.volume();
 }
}