interface P
{
    int p=1;
    void p();
}
interface P1 extends P
{
    int p1=2;
    void p1();
}
interface P2 extends P
{
    int p2=3;
    void p2();
}
interface P12 extends P1, P2
{
    int p12=4;
    void p12();
}
class Q implements P12
{
    public void p()
    {
        System.out.println("Constant of P   : "+p);
    }
    public void p1()
    {
        System.out.println("Constant of P1  : "+p1);
    }
    public void p2()
    {
        System.out.println("Constant of P2  : "+p2);
    }
    public void p12()
    {
        System.out.println("Constant of P12 : "+p12);
    }
}
class Main
{
    public static void main(String args[]) 
    {
        Q obj = new Q();
        obj.p();
        obj.p1();
        obj.p2();
        obj.p12();    
    }
}