interface B
{
    void show();
}

class D implements B
{
    public void show()
    {
        System.out.println("Derived class");
    }
    
    public void line()
    {
        System.out.println("=========================");
    }
}

class Upcast
{
    public static void main(String[] obj)
    {
        B bref=new D();
        //bref.show();
        ((D)bref).line();
        D dref= (D) bref;
        dref.line();
        
    }
}

