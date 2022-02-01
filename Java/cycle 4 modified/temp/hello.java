import java.io.*;
import java.util.*;

class prg5
{
    public static void main(String args[]) throws IOException
    {
        String s;
        int a[]= new int[100],i=0,sum=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a line of integers");
        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        System.out.println("The integers entered are");
        while(st.hasMoreTokens())
        {
            a[i] = Integer.parseInt(st.nextToken());
            sum += a[i];
            System.out.println(a[i]);
            i++;
        }
        System.out.println("Sum of the given integers : "+sum);
    }
}