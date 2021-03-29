import java.util.Scanner;
class TwodArr
{
    public static void main(String[] args)
    {
        int m,n,r,c;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter number of rows");
        m=obj.nextInt();
        System.out.print("Enter number of cols");
        n=obj.nextInt();
        int []A[]=new int [m][n];
        for(r=0;r<A.length;r++)
        {
            for(c=0;c<A[r].length;c++)
            {
                System.out.print("ENter value:");
                A[r][c]=obj.nextInt();
            }
        }
        new Process().show(A);
    }
}
class Process
{
   
    void show(int ary[][])
    {
         int r,c;
        for(r=0;r<ary.length;r++)
        {
            for(c=0;c<ary[r].length;c++)
            {
                System.out.print(ary[r][c]+" ");
            }
            System.out.println();
        }
    }
}