import java.io.*;
class file1
{
    public static void main(String[] args)
    {
        try
        {
            int dcount=0;
            int fcount=0;
            File f1=new File("c:\\Windowssss");
            File fff=new File("c:\\Windows");
            File[] arr=f1.listFiles();
            for(File ref:arr)
            {
                if(ref.isDirectory())
                {
                    dcount++;
                }
                else
                {
                    fcount++;
                }
            }
            System.out.println("Files:"+fcount+" "+"Directory"+dcount);
            boolean b=f1.mkdir();
            if(b==true)
            {
                System.out.println("Directory created...");
            }
            else
            {
                System.out.println("Already exists");
            }
            File f2=new File(f1,"sample.txt");
            boolean b1=f2.createNewFile();
            if(b1==true)
            {
                System.out.println("File created...");
            }
            else
            {
                System.out.println("File already exists..");
            }
            System.out.println("it exists:"+f1.exists());
           /* boolean d=f2.delete();
            if(d==true)
            {
                System.out.println("Deleted");
            }
            else
            {
                System.out.println("Dont exist");
            }*/
            System.out.println("Read :"+f2.canRead()+"Write :"+f2.canWrite());
            
        }
        
        catch(IOException e)
        {
            
        }
    }
}