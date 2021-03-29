import mypack3.electricity.*;
import mypack3.TotBill;
import static mypack3.Lines.*;
class Package
{
    public static void main(String[] args)
{
        line();
    Bill bb=new Bill();
    Tax tt=new Tax();
    bb.setBill(100,100,100);
    tt.setTax(10);
    TotBill tb=new TotBill();
    float tot=tb.getTot(bb,tt);
        System.out.println("Total Bill:"+tot);
        dbline();
        
        
}
    
}
