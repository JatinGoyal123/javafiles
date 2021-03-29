interface draw
{
    public abstract void draw();
}
class shape implements draw
{
    public void draw()
    {
        System.out.println("Draw shape");
    }
}
class design implements draw
{
    public void draw()
{
    System.out.println("Draw design");
}
}
class Rect extends shape
{
    public void draw()
{
    System.out.println("Draw rectangle");
}

}
class Circle extends shape
{

    public void draw()
{
    System.out.println("Draw circle");
}

}

class Poly
{
    public static void main(String[] args)
    {
        shape s[]={new Rect(),new Circle()};
        draw d[]={new shape(),new design()};
        System.out.println("Output");
        for(shape ss:s)
        {
            ss.draw();
        }
        for(draw dd:d)
        {
            dd.draw();
        }
    }
}