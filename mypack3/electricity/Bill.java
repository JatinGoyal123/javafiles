package mypack3.electricity;
public class Bill
{
    float tv,fan,ac,bill;
    public void setBill(float tv,float fan,float ac)
    {
        this.tv=tv;
        this.fan=fan;
        this.ac=ac;
    }
    
    public float getBill()
    {
        bill=tv+fan+ac;
        return bill;
    }
    
}