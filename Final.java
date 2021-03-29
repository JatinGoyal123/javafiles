class Rect
{
    int l=100,b=200;
    
}
class Exp
{
    final int v1=10;
    final int v2;
    static final int v3=15;
    final Rect ref=new Rect();
    public Exp()
    {
        v2=20;
    }
    
    void show()
    {
        System.out.println("v1:"+v1);
        //ref=new Rect();error
        //v1+=5;
        System.out.println("v2:"+v2);
        System.out.println("v3:"+v3);
        System.out.println("length"+(ref.l));
        ref.b+=10;//allowed to change the state of object
        System.out.println("length"+(ref.b));
        final int lv=55;
        System.out.println("lv:"+lv);
        
        
    }
    
}
class Final
{
    public static void main(String[] args)
    {
        Exp ex=new Exp();
        ex.show();
    }
}