import java.io.*;
import java.util.*;

class prog6
{
    public static void main(String[] args) 
    {
        try
        {
            String str;
            int ch=0, lines=0, words=0;
            BufferedReader fin = new BufferedReader(new FileReader("file.txt"));    
            str = fin.readLine();
            while(str != null)
            {
                lines++;
                ch+= str.length();
                StringTokenizer st = new StringTokenizer(str);
                words+= st.countTokens();
                str = fin.readLine();
            }
            System.out.println("No. of Characters : "+ch);
            System.out.println("No. of Words      : "+words);
            System.out.println(("No. of Lines     : "+lines));
        }
        catch(IOException E)
        {
            System.out.println(E);
        }
    }
}