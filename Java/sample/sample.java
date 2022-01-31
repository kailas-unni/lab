class Area
{
    int l, b;
     void area()
    {
    	 l=10;
    	 b=20;
	System.out.println("Length * Breadth = "+l*b);
    }	 
}
class Main extends Area
{
    public static void main(String[] args)
    {
        area();
    }
}
