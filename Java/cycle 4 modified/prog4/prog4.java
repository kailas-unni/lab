import java.io.*;

class prog4
{
    public static void main(String args[]) 
    {
        try
        {
            int i=1;
            String str;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Input File : ");
            String filein = br.readLine();
            BufferedReader fin = new BufferedReader(new FileReader(filein));
            System.out.println("Enter Output File : ");
            String fileout = br.readLine();
            BufferedWriter fout = new BufferedWriter(new FileWriter(fileout));

            str = fin.readLine();
            while(str != null)
            {
                fout.write(i+": "+str+'\n');
                i++;
                str = fin.readLine();
            }

            fin.close();
            fout.close();
        }
        catch(IOException E)
        {
            System.out.println(E);
        }    
    }
}