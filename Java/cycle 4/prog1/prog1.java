abstract class Shape
{
    abstract void numberOfSides();
}
class Rectangle
{
    void numberOfSides()
    {
        System.out.println("Rectangle Number of Sides : 4");
    }
}
class Triangle
{
    void numberOfSides()
    {
        System.out.println("Triangle Number of Sides : 3");
    }
}
class Hexagon
{
    void numberOfSides()
    {
        System.out.println("Hexagon Number of Sides : 6");
    }
}
class Main
{
    public static void main(String args[]) {
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();
        Hexagon hex = new Hexagon();
        rec.numberOfSides();
        tri.numberOfSides();
        hex.numberOfSides();
    }
}