import java.io.*;

class prog1
{
    public static void main(String args[]) 
    {
        try
        {
            FileInputStream fin1 = new FileInputStream("file1.txt");
            FileInputStream fin2 = new FileInputStream("file2.txt");
            FileOutputStream fout = new FileOutputStream("file3.txt");
            
            int i=1;

            do
            {
                i=fin1.read();
                if(i!=-1)
                {
                    fout.write(i);
                }
            }while(i!=-1);
            do
            {
                i=fin2.read();
                if(i!=-1)
                {
                    fout.write(i);
                }
            }while(i!=-1);
           
            fin1.close();
            fin2.close();
            fout.close();
        }
        catch(IOException E)
        {
            System.out.println(E);
        }
    }
}