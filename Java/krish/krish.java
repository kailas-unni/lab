class AreaShape
{
	public static void main(String args[])
	{
		Shape circle=new Shape(10);
		Shape rectangle=new Shape(10,20);
		Shape trapezium=new Shape(10,20,30);
		Shape triangle=new Shape(10.00,20.00,30.00);
	}
}
class Shape
{
	int height,length,radius,breadth;
	float l1,l2,l3;
	Shape(int r)
	{
		this.radius=r;
		Area(radius);
	}
	Shape(int l,int b)
	{
		this.length=l;
		this.breadth=b;
		Area(length,breadth);
	}
	Shape(int h,int a,int b)
	{
		this.length=a;
		this.breadth=b;
		this.height=h;
		Area(height,breadth,length);
	}
	Shape(float a,float b,float c)
	{
		this.l1=a;
		this.l2=b;
		this.l3=c;
		Area(l1,l2,l3);
	}
	void Area(int r)
	{
		System.out.println("AREA OF CIRCLE IS:"+3.14*r*r);

	}
	void Area(int l,int b)
	{
		System.out.println("AREA OF RECTANGLE IS:"+l*b);
	}
	void Area(int h,int a,int b)
	{
		float result=(float)h*(a+b)/2;
		System.out.println("AREA OF TRAPEZIUM IS:"+result);
	}
	void Area(double a,double b,double c)
	{
		if((a+b>c)&&(a+c>b)&&(b+c>a))
		{
			double S=(a+b+c)/2;
			double result=Math.sqrt(S*(S-a)*(S-b)*(S-c));
			System.out.println("AREA OF TRIANGLE IS: "+result);
		}
		else
		{
			System.out.println("INVALID VALUES");
		}
	}			
}
