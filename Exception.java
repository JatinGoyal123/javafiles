class Exception
{
    public static void main(String[] args)
    {
        int A[]={2,4,6};
        System.out.println("Start");
        try
        {
        int indx=Integer.parseInt(args[0]); 
        int val=A[indx];
        System.out.println("val="+val);
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("index:"+ex.getMessage());
        }
        catch(NumberFormatException ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println("Completed");
    }
}