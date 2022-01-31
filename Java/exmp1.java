class Func
{
    double area;
    Func()
    {
    	area = 0;
    }
    Func(int a)
    {
    	area = a;
    }
    Func(int a, int b)
    {
    	area = a*b;
    }
}

class Main
{
    public static void main(String[] arg)
    {
        Func obj1 = new Func(10); 
        Func obj2 = new Func();
        Func obj3 = new Func(10,20);
        System.out.println(obj1.area);
        System.out.println(obj2.area);
        System.out.println(obj3.area);
    }
}
