interface nesting
{
    int x=5;
    void fun();
    
    interface Inter
    {
        int y=10;
        void fun1();
    }
     
    class Inner implements Inter
    {
        int z=20;
        public void fun1()
        {
        System.out.println("Inner Fun");
        }
    }

}

class Nested implements nesting
{
public static void main(String[] obj)
    {
        nesting ref=new Nested();
        ref.fun();
        nesting.Inner objj=new nesting.Inner();
        objj.fun1();
    }
public void fun()    
{
    System.out.println("Outer Fun");
}
}