class Shape
{
    void draw()
    {
        System.out.println("Drawing shapes");
    }
}
class Rect extends Shape
{
void draw()
{
System.out.println("Drawing Rectangle");
}
}

class Circle extends Shape
{
void draw()
{
System.out.println("Drawing Circle");
}
}

class Square extends Shape
{
void draw()
{
System.out.println("Drawing Square");
}
}

class List
{
  int i=0;
    Shape s[]=new Shape[3];
    void add(Shape arg)
    {
        if(i<s.length)
        {
            s[i]=arg;i++;System.out.println("Added..");
        }
        else
            System.out.println("Not enough space");
    }
    
    void drawAll()
    {
        for(int j=0;j<s.length;j++)
        {
            s[j].draw();
        }
    }
    
    Shape getCode(int c)
    {
        if(c<s.length)
            return s[c];
        else
            return null;
            
    }
    
}

class PAPR2
{
    public static void main(String[] obj)
    {
        List li=new List();
        li.add(new Rect());
        li.add(new Circle());
        li.add(new Square());
        li.add(new Rect());
        System.out.println("Draw....");
        li.drawAll();
        
        Shape rec=li.getCode(1);
        rec.draw();
        
        Square sq=(Square)li.getCode(2);
        sq.draw();
        
    }
}
