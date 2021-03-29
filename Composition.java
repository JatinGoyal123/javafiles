/*class Product
{
    int p=100,qty=2;
    void billing()
    {
        System.out.println("BILL="+(p*qty));
    }
}
class Mall
{
    Product mobRef=new Product();//Instance reference variable
    static Product lapRef=new Product();//static reference variable(called by classs name no need to create instance)
    static int estd=2001;//static primitive variable
}
class Composition
{
    public static void main(String obj[])
    {
        //Mall mm=new Mall();
        //System.out.println("p="+mm.mobRef.p);
        //mm.mobRef.billing();
        Mall.lapRef.billing();
        System.out.println("Still:"+Mall.estd);
    }
}*/


//-=-=-=-=-==-=-=-=-==-=-=-=-=--==-=-=--=--=-===

class Wheel
{
    int duration;
    void setDuration(int d)
    {
        duration=d;
    }
    void showDuration()
    {
        System.out.println("LIfetime of TYre:"+duration+" years");
    }
}

class Vehicle
{
    Wheel mrf=new Wheel();//IRV
    String brand;
    void setDetails(String b,int dur)
    {
        brand=b;
        mrf.setDuration(dur);
    }
   void showDetails()
    {
        System.out.println("Brand of TYre:"+brand);
        mrf.showDuration();
    }
    
    
}
 class Composition
 {
     public static void main(String obj[])
     {
         Vehicle car=new Vehicle();//LRV
         car.setDetails("MRF",20);
         car.showDetails();
         
     }
     
 }