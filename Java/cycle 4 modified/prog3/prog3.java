import java.io.*;
import java.util.*;

class prog3
{
    public static void main(String args[]) 
    {
        try
        {
            String file, str;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the File Name : ");
            file = br.readLine();
            BufferedReader fin = new BufferedReader(new FileReader(file));
            try
            {
                double arr[]=new double[100],sum=0, min, max;
                int i=0;
                while((str = fin.readLine()) != null)
                {
                    StringTokenizer st = new StringTokenizer(str);
                    while(st.hasMoreTokens())
                    {
                        arr[i] = Double.parseDouble(st.nextToken());
                        sum+= arr[i];
                        i++;
                    }
                }
                min = arr[0];
                max = arr[0];
                for(int k=1;k<i;k++)
                {
                    if(min > arr[k])
                        min = arr[k];
                    if(max < arr[k])
                        max = arr[k];
                }
                System.out.println("Minimum : "+min);
                System.out.println("Maximum : "+max);
                System.out.println("Average : "+sum/(i));
                System.out.println("Range  : "+(max-min));
            }
            catch(ArrayIndexOutOfBoundsException AE)
            {
                System.out.println(AE);
            }
            fin.close();
        }
        catch(IOException E)
        {
            System.out.println(E);
        }
    }
}