class MALL
{
    public static void main(String obj[])
    {
        PRODUCT refMob=new PRODUCT();
        float bill=refMob.billing(10,20);
        System.out.println("Amount:"+bill);
        refMob.line();
    }
}
class PRODUCT
{
    float billing(int qty,float price)
    {
        return (qty*price);
    }
    void line()
    {
        System.out.println("-==-=--==-=-=-==-=-=-=-");
    }
}