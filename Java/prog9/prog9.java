class Rectangle{
    int length, width, perimeter, area;
    Rectangle()
    {
        length = 10;
        width = 20;
    }
    Rectangle(int l, int w)
    {
        length = l;
        width = w;
    }
    void perimeter()
    {
        perimeter = 2*(length+width);
        System.out.println("Perimeter = "+perimeter);
    }
    void area()
    {
        area = length*width;
        System.out.println("Area = "+area);
    }
    int sameArea(Rectangle obj)
    {
        if(this.area == obj.area)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
class Main {
    public static void main(String[] arg) {
        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle(10,20);
        obj1.perimeter();
        obj1.area();
        obj2.perimeter();
        obj2.area();
        if(obj2.sameArea(obj1)==1)
            System.out.println("Same");
        else
            System.out.println("Different");
    }    
}
