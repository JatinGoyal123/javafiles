import java.util.Scanner;
class PassTwodArr
{
    public static void main(String[] args)
    {
        int m,n,r,c;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter no of rows:");
        m=obj.nextInt();
        System.out.print("Enter no of cols:");
        n=obj.nextInt();
        int [][]A=new int[m][n];
        int [][]B=new int[m][n];
        for(r=0;r<A.length;r++)
        {
            for(c=0;c<A[r].length;c++)
            {
                System.out.print("Enter element of matrix 1:");
                A[r][c]=obj.nextInt();
            }
            
        }
        
       for(r=0;r<B.length;r++)
        {
            for(c=0;c<B[r].length;c++)
            {
                System.out.print("Enter element of matrix 2:");
                B[r][c]=obj.nextInt();    
            }
            
        }
        
        Sum ref=new Sum();
        int[][] sum=ref.doSum(A,B);
          
        for(r=0;r<sum.length;r++)
        {
            for(c=0;c<sum[r].length;c++)
            {
               System.out.print(sum[r][c]+" ");
            }
            System.out.println();
        }
    }
}


class Sum
{
    int r,c;
    int[][] doSum(int[][] ary1,int[][] ary2)
    {
        int[][] C=new int[ary1.length][ary1.length];
        for(r=0;r<ary1.length;r++)
        {
            for(c=0;c<ary1[r].length;c++)
            {
                C[r][c]=ary1[r][c]+ary2[r][c];
            }
        }
        return (C);
    }
}