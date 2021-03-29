class Cone
{
    int rad,ht;
    Cone(int r,int h)
    {
        
        rad=r;
        ht=h;
    }
    void show()
    {
        System.out.println("RAdius="+rad+" "+"Height="+ht);
    }
}
 

class GCC
{
    public static void main(String obj[])
    {
        Cone c1=new Cone(10,20);
        Cone c2=new Cone(30,40);
        c1=c2;
        c1.show();
        Cone c3=c1;
        c3.show();
    }
}
