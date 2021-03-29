package mypack3.electricity;
public class Tax
{
    float amount,tax;
    public void setTax(float amount)
    {
        this.amount=amount;
    }
    
    public float getTax()
    {
        tax=amount/10;
        return tax;
    }
    
}