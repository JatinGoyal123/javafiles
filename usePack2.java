
import mypack2.NetSalary;
import mypack2.employees.*;
import static mypack2.Line.*;
public class usePack2
{
    public static void main(String[] args)
    {
        line();
        Salary sa=new Salary();
        Loan lo=new Loan();
        sal.setSal(100);
        lo.setAmt(10);
        NetSalary ns=new NetSalary();
        float net=ns.getNet(sa,lo);
        System.out.println("Net salary="+net);
        dbline();
        
    }
}
