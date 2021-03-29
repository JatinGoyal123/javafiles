package mypack2;
import mypack2.employees.*;
public class NetSalary
{
    float net;
    public float getNet(Salary s,Loan l)
    {
        net=s.getSal()-l.getInterest();
        return net;
    }
}
