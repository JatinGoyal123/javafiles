class common
{
    double pi=3.14;
    double getSquare(double r)
    {
        return (r*r);
    }
}
class area extends common
{
    double ar;
    void area(double r)
    {
        ar=pi*getSquare(r);
        System.out.println("Area of circle:"+ar);
    }
}
class volume extends common
{
double vol;
void vol(double r,double h)
{
    vol=pi*getSquare(r)*h;
    System.out.println("volume of cylinder:"+vol);
}
}
class IDemo
{
    public static void main(String[] obj)
    {
        area circle=new area();
        circle.area(10.0);
        volume cyl=new volume();
        cyl.vol(10.0,10.0);
        
    }
}