import java.io.*;
import java.io.IOException;
class Merge
{
    public static void main(String args[])throws IOException
    {
        try{
            File f=new File("File3.txt");
            FileReader fr1=new FileReader("File1.txt");
            FileWriter fw=new FileWriter("File3.txt");
            BufferedReader br1=new BufferedReader(new FileReader("File1.txt"));
            String s1=br1.readLine();
            while(s1!=null)
            {
                fw.write(s1);
                fw.write("\n");
                s1=br1.readLine();
            }
            FileReader fr2=new FileReader("File2.txt");
            BufferedReader br2=new BufferedReader(new FileReader("File2.txt"));
            String s2=br2.readLine();
            while(s2!=null)
            {
                fw.write(s2);
                fw.write("\n");
                s2=br2.readLine();
            }
            fw.flush();
            fw.close();
            fr2.close();
            fr1.close();
            br1.close();
            br2.close();
        }
        catch(IOException E)
        {
            System.out.println(E);
        }
          
    }
}