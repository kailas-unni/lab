class Area{
    double area(double r)
    {
        return 3.14*r*r;
    }
    double area(double l, double b)
    {
        return l*b;
    }
    double area(double h, double a, double b)
    {
        return 0.5*h*(a+b);
    }
    double area(int b, int h)
    {
        return 0.5*b*h;
    }
}
class Main{
    public static void main(String[] args)
    {
        double a1, a2, a3, a4;
        Area circ = new Area();
        Area rec = new Area();
        Area trap = new Area();
        Area tri = new Area();
        a1 = circ.area(10.0);
        a2 = rec.area(10.0,10.0);
        a3 = trap.area(10.0,10.0,10.0);
        a4 = tri.area(10,10);
        System.out.println(a1+" "+a2+" "+a3+" "+a4);
    }
}
