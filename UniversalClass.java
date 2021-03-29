class Rect
{
    int l,b;
    void setLB(int x,int y)
    {
        l=x;
        b=y;
    }
    public boolean equals(Object obj)//overrides equal finction for meaningful results.
    {
    if(((Rect)obj).l==l&&((Rect)obj).b==b )
        return true;
        else 
            return false;
    }
}
class UniversalClass
{
    public static void main(String[] args)
    {
        Rect r1=new Rect();
        r1.setLB(1,2);
        Rect r2=new Rect();
        r2.setLB(1,2);
        System.out.println(r1==r2);//reference equality operator
        System.out.println(r1.equals(r2));
        
    }
}

//-=-==-=-=-=-=-=-====================================================----------


/*
class UniversalClass//inherited implicitly in all classes
{
    public static void main(String[] args)
    {
       String s1=new String("BCE");
        String s2=new String("BCE");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));//string class overrides equals operator for content equality
        
    }
}*/


//==--==-=--=--=-=-===--==--=-==--======================

/*class Rect
{
    int l,b;
    Rect(int l1,int b1)
    {
        l=l1;
        b=b1;
    }
    
    public String toString()//overrides toString method for better output.
    
    {
        return ("L:"+l+"B:"+b);
    }
}

class UniversalClass
{
    public static void main(String[] args)
    {
        Rect R1=new Rect(1,2);
        System.out.print(R1.toString());
        //System.out.print(R1);return shash code with class name and @ symbol
        
    }
}*/