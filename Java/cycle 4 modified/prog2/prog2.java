import java.io.*;

class prog2
{
    public static void main(String args[])
    {
        try
        {
            BufferedReader fin1 = new BufferedReader(new FileReader("file1.txt"));
            BufferedReader fin2 = new BufferedReader(new FileReader("file2.txt"));
            BufferedWriter fout = new BufferedWriter(new FileWriter("file3.txt"));

            String str1, str2;

            do
            {
                str1 = fin1.readLine();
                str2 = fin2.readLine();
                if(str1 != null)
                {
                    fout.write(str1+'\n');
                }
                if(str2 != null)
                {
                    fout.write(str2+'\n');
                }
            }while(str1!=null || str2!=null);

            fin1.close();
            fin2.close();
            fout.close();

        }catch(IOException E)
        {
            System.out.println(E);
        }

    }
}