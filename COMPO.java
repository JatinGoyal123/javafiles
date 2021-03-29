class Product
{
    int price=100;
    int qty=2;
    void billing()
    {
        System.out.println("Total:"+(price*qty));
    }
}
class Mall
{
    Product mobRef=new Product();
    static Product lapRef=new Product();
    static int year=2001;
}
class COMPO
{
    public static void main(String args[])
    {
        Mall MM=new Mall();
        System.out.println(MM.mobRef.price);
        MM.mobRef.billing();//calling using object of mall class
        System.out.println(Mall.lapRef.price);
        Mall.lapRef.billing();
        System.out.println("estd:"+Mall.year);
        
    }
}
