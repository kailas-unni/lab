import java.io.*;
import java.util.*;

class prog5
{
    public static void main(String args[]) 
    {
        try
        {
            int sum=0, temp;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter line of integers : ");
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            System.out.println("Integers are : ");
            while(st.hasMoreTokens())
            {
                temp = Integer.parseInt(st.nextToken());
                sum+= temp;
                System.out.println(temp);
            }
            System.out.println("Sum : "+sum);
        }
        catch(IOException E)
        {
            System.out.println(E);
        }
    }
}