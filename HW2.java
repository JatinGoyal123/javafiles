class HW2
{
    static float billing(float price,int qty)
    {
     float bill=(price*qty);
        return (bill);
    }
    static int fact(int n)
    {
        if(n==0)
            return 1;
        else if(n==1)
            return 1;
        else
            return (n*fact(n-1)); 
    }
    static float siInt(float p,int r,int t)
    {
        float si=(p*r*t)/100;
        return (si);
    }
    static float volCyl(float rad,float h)
    {
        float vol1=3.14f*rad*rad*h;
        return (vol1);
    }
    static float volCone(float rad,float h)
    {
        float vol2=(3.14f*rad*rad*h)/3;
        return (vol2);
    }
    static int getMax(int a,int b,int c)
    {
        int large=a>b?(a>c?a:c):(b>c?b:c);
        return (large);
    }
    public static void main(String obj[])
    {
        float tot=billing(10.0f,5);
        int f=fact(5);
        float si=siInt(12.5f,100,5);
        float volCyl=volCyl(10.0f,10.0f);
        float volCone=volCone(10.0f,10.0f);
        int max=getMax(123,321,786);
        System.out.println("Maximum of 3 numbers="+max);
        System.out.println("Volume of cone="+volCone);
        System.out.println("Volume of cylinder="+volCyl);
        System.out.println("Simple-Interest="+si+"%");
        System.out.println("Factorial="+f);
        System.out.println("Total-bill="+tot);
    }
}
