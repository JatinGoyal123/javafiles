package mypack3;
import mypack3.electricity.*;
public class TotBill
{
    float tot;
    public float getTot(Bill b,Tax t)
    {
        tot=b.getBill()+t.getTax();
        return tot;
    }
}