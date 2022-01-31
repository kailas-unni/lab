abstract class Shape
{
 abstract void numberOfSides();
 void display()
 {
  System.out.println("HELLO");
 }
}

class Rectangle extends Shape
{
 void numberOfSides()
 {
  System.out.println("NO : OF SIDES OF RECTANGLE : 4");
 }
}

class Triangle extends Shape
{
 void numberOfSides()
 {
  System.out.println("NO : OF SIDES OF TRIANGLE : 3");
 }
}

class Hexagon extends Shape
{
 void numberOfSides()
 {
  System.out.println("NO : OF SIDES OF HEXAGON : 6");
 }  
}
class sides 
{
 public static void main(String arg[])
 {
  Rectangle r =new Rectangle();
  Triangle t=new Triangle();
  Hexagon h = new Hexagon();
  r.numberOfSides();
  t.numberOfSides();
  h.numberOfSides();
  r.display();
 }
}