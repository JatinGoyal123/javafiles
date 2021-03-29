import java.io.*;
import java.lang.*;
public class CopyImage{

	public static void main(String[] args) {
        
        FileInputStream fis=null;
		FileOutputStream fos=null;
		try
		{
			File src=new File("me.jpg");
            fis=new FileInputStream(src);
			File des=new File("mee1.jpg");
		 
		 fos=new FileOutputStream(des);
		int count=0,i;
            try
            {
		while((i=fis.read())!=-1)
		{
			fos.write(i);
			count++;
			
		}
            }
        catch(IOException ex)
        {}
		System.out.println("Image copied..");
		}
        
		catch(FileNotFoundException ex)
		{
			System.out.println("Unhandled");
		}
		try
		{
			fis.close();
			fos.close();
		}
		catch(IOException ex)
		{
			System.out.println("Unhandled");
		}
	}

}
