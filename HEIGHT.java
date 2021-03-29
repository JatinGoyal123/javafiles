import java.lang.*;
import java.util.*;
class HEIGHT
{
    public static void main(String obj[])
    {
        Data H1=new Data();
        Data H2=new Data();
        H1.setFH();
        H1.shows();
        H2.setFH();
        H1.shows();
        Data H3=H1.subHeight(H2);
        H3.show();
    }
}
class Data
{
    int feet;
    int inch;
    int opt;
    void setFH()
    {
        Scanner ref=new Scanner(System.in);
        System.out.print("Enter feet:");
        int feeti=ref.nextInt();
        System.out.print("Enter inch:");
        int inchi=ref.nextInt();
        feet=feeti;
        inch=inchi;
    }
    
    void show()
    {
        System.out.println("Difference in HEight="+feet+"feet"+"-"+inch+"inch");
        
        
    }
    
    void shows()
    {
        System.out.println("Height is="+feet+"feet"+"-"+inch+"inch");
        
    }
    Data subHeight(Data H) 
    {
        Data bhaiObj=new Data();
        int diff=Math.abs(((feet*12)+inch)-((H.feet*12)+H.inch));
        bhaiObj.feet=diff/12;
        bhaiObj.inch=diff%12;
        return bhaiObj;
        
    }
   
}


/*
class HEIGHT
{
    public static void main(String arg[])
    {
        Data H1=new Data();
        Data H2=new Data();
        H1.setFH(6,19);
        H2.setFH(6,7);
        Data H3=H1.subHeight(H2);
        H3.show();
       
    }
}
class Data
{
    int feet;
    int inch;
    void setFH(int f,int i)
    {
        feet=f;
        inch=i;
        if(inch>12)
        {
            int diffeet=(inch/12);
            int diffinch=(inch%12);
            feet+=diffeet;
            inch=diffinch;
        }
    }
    
    void show()
    {
 T       System.out.println("Difference in HEight="+feet+"feet"+"-"+inch+"inch");
    }
    
    Data subHeight(Data aref) 
    {
        Data bhaiObj=new Data();
        bhaiObj.feet=Math.abs(feet-aref.feet);
        bhaiObj.inch=Math.abs(inch-aref.inch);
        return bhaiObj;
        
    }
}
*/

