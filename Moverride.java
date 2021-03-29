class Rect
{
    void fun()
    {
        System.out.println("Area Of Rectangle");
    }
}
class Circle extends Rect
{
    void fun()
    {
        System.out.println("area Of Circle");
    }
    void Rarea()
    {
        super.fun();
    }
}
class Moverride
{
    public static void main(String[] args)
    {
        Circle obj=new Circle();
        obj.fun();
        obj.Rarea();
    }
}

/*class Rect
{
    void area()
    {
        System.out.println("area Of rect");
    }
}
class Circle extends Rect
{
    void area()
    {
        System.out.println("area Of circle");
    }
    void rarea()
    {
    super.area();
    }
}
class Moverride
{
    public static void main(String[] args)
    {
        Circle obj=new Circle();
        obj.area();
        obj.rarea();
    }
}*/