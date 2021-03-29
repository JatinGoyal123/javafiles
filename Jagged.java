class Jagged
{
    public static void main(String[] args)
    {
        int[][] A=new int[4][];
        A[0]=new int[1];
        A[1]=new int[]{1,2};
        A[2]=new int[]{3,4,5};
        A[3]=new int[]{6,7,8,9};
        System.out.println("....OUTPUT....");
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A[i].length;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}