/*
abstract class Rect
{
    abstract void area();
    void line()//concrete method
    {
        System.out.println("-=-=-=-=-=-=-=-=-");
    }
}
class Circle extends Rect
{
    void area()
    {
    System.out.println("Area of Circle");
    }
}

class AbstractCM
{
    public static void main(String[] obj)
    {
        Circle cref=new Circle();
        cref.area();
        Rect bref;
        bref=new Circle();
        bref.area();
        bref.line();
        cref.line();
        
    }
}
*/


//=-==================


abstract class Salary
{
    int month=50;
    int hour=500;
    int amount;
    abstract void calc();
}


class Hourly extends Salary
{
    int hp;
    Hourly(int h)
    {
        hp=h;
    }
    
    void calc()
    {
        amount=hour*hp;
        System.out.println("Amount per hour:"+hp);
        System.out.println("Total amount for hours:"+amount);
        
    }
}

class Monthly extends Salary
{
    int mp;
    Monthly(int m)
    {
    mp=m;
    
    }
    void calc()
    {
        amount=month*mp;
        System.out.println("Amount per month:"+mp);
        System.out.println("Total amount for months:"+amount);
    }
}


class AbstractCM
{
    public static void main(String[] args)
    {
        Hourly href=new Hourly(120);
        href.calc();
        Monthly mref=new Monthly(100);
        mref.calc();
        
    }
}