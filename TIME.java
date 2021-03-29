import java.lang.*;
class TIME
{
    public static void main(String arg[])
    {
        Data T1=new Data();
        Data T2=new Data();
        T1.setTime(1,59,59);
        T2.setTime(8,24,1);
        Data T3=T1.subTime(T2);
        T3.show();
    }
}
class Data
{
    int hour;
    int min;
    int sec;
    void setTime(int h,int m,int s)
    {
        hour=h;
        min=m;
        sec=s;
        if((min>60) || (sec>60))
        {
            min+=(sec/60);
            sec=sec%60;
            hour+=(min/60);
            min=min%60;
        }
    }
    
    void show()
    {
        System.out.println("Difference in time of clocks="+hour+"hour"+"-"+min+"min"+"-"+sec+"sec");
    }
    
    Data subTime(Data t) 
    {
        Data bhaiObj=new Data();
        int temp=Math.abs((hour*3600+min*60+sec)-(t.hour*3600+t.min*60+t.sec));
        bhaiObj.hour=temp/3600;
        temp=temp-(bhaiObj.hour*3600);
        bhaiObj.min=temp/60;
        bhaiObj.sec=temp%60;
        return bhaiObj;
        
    }
}