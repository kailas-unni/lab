import java.io.*;

class prg1
{
    public static void main(String args[]) throws IOException
    {
        FileInputStream fin1;
        FileInputStream fin2;
        FileOutputStream fout;

        int i;

        try
        {
            fin1 = new FileInputStream("f1.txt");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("INPUT FILE NOT FOUND");
            return;
        }

        try
        {
            fin2 = new FileInputStream("f2.txt");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("INPUT FILE NOT FOUND");
            fin1.close();
            return;
        }

        try
        {
            fout = new FileOutputStream("f3.txt");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("OUTPUT FILE NOT FOUND");
            fin1.close();
            fin2.close();
            return;
        }

        try
        {
            do
            {
                i=fin1.read();
                if(i != -1)
                   fout.write(i);
            } while(i!=-1);
            fout.write('\n');

            do
            {
                i=fin2.read();
                if(i != -1)
                   fout.write(i);
            } while(i!=-1);
        }

        catch(IOException e)
        {
            System.out.println("FILE ERROR");
        }

        fin1.close();
        fin2.close();
        fout.close();
    }
}