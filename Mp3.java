import java.io.*;
import java.lang.*;
public class Mp3
{
    public static void main(String[] args)
    {
        File src=new File("C:\\Windowssss\\song.mp3");
        File des=new File("C:\\Windowssss\\song1.mp3");
        int count=0;
        try
        {
            FileInputStream fis=new FileInputStream(src);
            FileOutputStream fos=new FileOutputStream(des);
            while(true)
            {
                int pix=fis.read();
                if(pix==-1)break;
                fos.write(pix);
                if(count==12000)break;
                count++;
            }
            System.out.println("Copied..");
        }
        
        catch(IOException ex)
        {
            System.out.println("Unhansdles");
        }
    }
}