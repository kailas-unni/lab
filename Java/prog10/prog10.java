class Complex{
    float real, img;
    Complex(int r, int i)
    {
        real = r;
        img = i;
    }
    Complex sum(Complex obj)
    {
        Complex sum = new Complex(0,0);
        sum.real = obj.real + this.real;
        sum.img = obj.img + this.img;
        return sum;
    }
}

class Main {
public static void main(String[] arg){
    Complex num1 = new Complex(10, 20);
    Complex num2 = new Complex(20, 10);
    Complex sum = new Complex(0,0);
    sum = num2.sum(num1);
    System.out.println(sum.real+" + "+sum.img+"i");
    }
}
