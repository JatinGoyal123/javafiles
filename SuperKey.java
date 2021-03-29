/*class Ba
{
    float p1=10.8f;
}
class Der extends Ba
{
    float p1=12.12f;
    void showP1()
    {
    System.out.println("rate1:"+super.p1);
    System.out.println("rate2:"+p1);
    }
    
}
class SuperKey
{
    public static void main(String args[])
    {
        Der obj1=new Der();
        obj1.showP1();
        
    }
}
//=-=-=-=-=-=--------------------------------
class loan
{
    float rate=10.0f;
    
}
class home extends loan
{
float rate=12.12f;
void show()
{
System.out.println("rate1:"+super.rate);
System.out.println("rate2:"+rate);

}
}
class SuperKey
{
    public static void main(String[] args)
    {
        home h1=new home();
        h1.show();
    }
}
//=-=--=-=-=-------------------------------
class B
{
    void area()
    {
        System.out.println("ARea of Circle");
    }
}


class D extends B
{
    void area()
    {
        super.area();
        System.out.println("ARea of Rectangle");
        
    }
}

class SuperKey
{
public static void main(String[] args)
{
D obj=new D();
    
obj.area();
}
}*/

//-==-=-------------------------
/*
class B1
{
    B1()
    {
        System.out.println("constructor of base");
    }
}

class D extends B1
{
    D()
    {
        System.out.println("constructor of derived");
    }
}
class SuperKey
{
    public static void main(String[] args)
    {
        D obj=new D();
    }
}*/
//==-=---------------------------
/*
class B
{
    float pi;
    B()
    {
        pi=3.14f;
    }
}
class D extends B
{
float ar;
D()
{
    ar=pi*10*10;
}

void show()
{
System.out.println("ARea of Circle:"+ar);
}

}
class SuperKey
{
    public static void main(String[] args)
    {
        D obj=new D();
        obj.show();
    }
}*/
//=-==-==============------------------------====================

class B
{
    String s;
    B(){}
    B(String ss)
    {
        s=ss;
    }
}
class D extends B
{
    float b;
    D(){}
    D(String str,float bal)
    {
        super(str);
        b=bal;
    }
    void show()
    {
        System.out.println("NAme is:"+s);
        System.out.println("Bank Balance:"+b);
        
    }
}


class SuperKey
{
    public static void main(String[] args)
    {
        D obj;
        obj=new D("ABC",15000.80f);
        obj.show();
    }
}