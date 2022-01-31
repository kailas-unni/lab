class Time{
    int hours, min;
    Time()
    {
        hours = 0;
        min = 0;
    }
    Time(int h)
    {
        hours = h;
        min = 0;
    }
    Time(int h, int m)
    {
        hours = h;
        min = m;
    }
    Time sum(Time obj)
    {
        Time sum = new Time();
        sum.hours = obj.hours + this.hours;
        sum.min = obj.min + this.min;
        while(sum.min>60)
        {
        	sum.min-=60;
        	sum.hours++;
        }
        return sum;
    }
}
class Main {
    public static void main(String[] arg)
    {
        Time t1 = new Time(5,60);
        Time t2 = new Time(3,40);
        Time t3 = new Time();
        t3 = t2.sum(t1);
        System.out.println("Sum : "+t3.hours+" hours and "+t3.min+" minutes");
    } 
}
