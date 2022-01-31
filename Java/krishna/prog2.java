interface P
{
 final int p=10;
 public void display1();
}

interface P1 extends P
{
 final int p1=20;
  public void display2();
}

interface P2 extends P
{
 final int p2=30;
 public void display3();
}

interface P12 extends P1,P2
{
 final int p12=40;
 public void display4();
}

class Q implements P12
{
 public void display1()
 {
  System.out.println("P = "+p);
 }
 public void display2()
 {
  System.out.println("P1 = "+p1);
 }
 public void display3()
 {
  System.out.println("P2 = "+p2);
 }
 public void display4()
 {
  System.out.println("P3 = "+p12);
 }
}
class inh
{
 public static void main(String arg[])
 {
  Q a = new Q();
  a.display1();
  a.display2();
  a.display3();
  a.display4();
 }
}
