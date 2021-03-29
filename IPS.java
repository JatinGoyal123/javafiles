/*class PRODUCT
{
    int qty;//No private
    int price=5000;//local primitive variable,no private
    void billing()
    {
        System.out.println("Bill:"+(qty*price));
    }
}
class IPS
{
    public static void main(String obj[])
    {
        PRODUCT mob;
        mob=new PRODUCT();
        //int x;will give error because it do not take 0 value by default.
        System.out.println("qty:"+mob.qty);//accessing private variable
        mob.qty=2;
        mob.billing();    
    }
}*/
//=--=--=-==-=-=--------------------------------=-=-==-=-=-=-=-=-=-=-=-

/*class Volume
{
    float rad;
    float ht=10.0f;
    void volume()
    {
        System.out.println("Volume of Cylinder:"+(3.14f*rad*rad*ht));
    }
}
class IPS
{
    public static void main(String obj[])
    {
        Volume ref;
        ref=new Volume();
        ref.rad=10.0f;
        ref.volume();
    }
}

//=--=--=-==-=-=--------------------------------=-=-==-=-=-=-=-=-=-=-=-

class IPS
{
    public static void main(String obj[])
    {
        int x=5;
        Rect ref=new Rect();
        ref.area();
    }
}
class Rect
{
    void area()
    {
        int l=30,b=10;
        System.out.println("Area of Rectangle:"+(l*b));
    }
}*/

//===-=-=-=-=-=-=--=-=-==-=-=-=-=====================-=-=---==-=---=-=-=-

/*class IPS
{
    public static void main(String obj[])
    {
    Factorial ref=new Factorial();
    int factt=ref.fact(5);
    System.out.println("FACTORIAL:"+factt);
    }
    
}
class Factorial
{
    int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
            
        }
        else
        {
            return (n*fact(n-1));
        }
    }
    
}*/


class IPS
{
    public static void main(String obj[])
    {
        Interest ref=new Interest();
        ref.p=10.0f;
        ref.r=20.0f;
        ref.t=1.5f;
        ref.si();
        
    }
}
class Interest
{
    float p,r,t;
    void si()
    {
        float si=(p*r*t)/100.0f;
        System.out.println("Simple Interest:"+si+"%");
    }
    
}