/*class JSG2
{
    public static void main (String obj[])
    {
        int x=5,y=6,z;
        z=x+y;
        //System.out.println(z);
        System.out.println(z);
        System.out.println("Sum="+z);
        System.out.println("Sum="+x+y);
        System.out.println("Prod="+x*y);
        System.out.println("Prod="+(x*y));
        System.out.println("Sum="+(x+y));
        System.out.println("x="+x+ " y="+y+ " Sum="+z);
        
    }
}*/
class JSG2
{
    public static void main(String obj[])
    {
        int a,b,c;
        a=2;b=3;//This will lead to error because comma initialisation is not allowed.
        c=a+b;
        System.out.println("Sum="+c);
    }
}