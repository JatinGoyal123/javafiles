class Diagonal
{
    public static void main(String[] args)
    {
        int[][] A=
        {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
    System.out.println("MATRIX IS:");
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<A[i].length;j++)

        {
            System.out.print(A[i][j]+" ");
            
        }
        System.out.println();
    }
    System.out.println("DIAGONAL ELEMENTS:");
     for(int i=0;i<3;i++)
    {
        for(int j=0;j<A[i].length;j++)

        {
            if(i==j || i+j==(A[i].length-1))
            {
                System.out.print(A[i][j]+" ");
            }
            
        }
        
     
    }
        System.out.println();
        System.out.println("MAtrix with only diAGONAL ELEMNETS:");
        for(int i=0;i<3;i++)        
        {
            
        for(int j=0;j<A[i].length;j++)

        {
            if(i==j || i+j==(A.length-1))
            {
                System.out.print(A[i][j]+" ");
            }
            
            else
            {
                A[i][j]=0;
                System.out.print(A[i][j]+" ");
            }
        }
            System.out.println();
     
    }           
        
        
        
    }
}