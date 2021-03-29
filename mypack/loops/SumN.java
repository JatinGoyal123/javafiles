package mypack.loops;
public class SumN
{
    public int getSum(int n)
    {
        int i,sum=0;
        for(i=0;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    }
}