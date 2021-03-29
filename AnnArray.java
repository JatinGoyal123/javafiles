class AnnArray
{
    public static void main(String[] args)
    {
        double avg=getAvg(new double[]{1.2,2.4,3.6});
        System.out.println("Average:"+avg);
    }
    static double getAvg(double[] D)
    {
        int i;
        double sum=0;
        for(i=0;i<D.length;i++)
        {
            sum+=D[i];
        }
        return sum/D.length;
    }
}
