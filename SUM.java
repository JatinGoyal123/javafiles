import java.util.Scanner;
public class SUM
{
    public static void main(String args[])
    {
        int n,i,j;
        System.out.print("Enter size of array:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        int[] ary1=new int[n];
        int[] ary2=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.print("ENter element of 1st array");
            ary1[i]=obj.nextInt();
        }
        System.out.println("=--=-=-=-=-=-==--=-=-=-=-=-");
         for(j=0;j<n;j++)
        {
            System.out.print("ENter element of 2nd array");
            ary2[j]=obj.nextInt();
        }
        Process ref=new Process();
        int[] C=ref.getSum(ary1,ary2);
        //int[] C=ref.getSum(ary1,ary2,n);
        for(i=0;i<n;i++)
        {
            System.out.println("Elements of third array are:"+C[i]);
        }
    }
}
class Process
{
    int i;
    int[] getSum(int[] A,int[] B)
    {
        int[] C=new int[A.length];
        //int[] C=new int[n];
        for(i=0;i<A.length;i++)
        {
            C[i]=A[i]+B[i];
        }
        return (C);
    }
}
