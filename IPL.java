//AGGREGATION
class Player
{
    String name="Rohit Sharma";
    void showName()
    {
        System.out.println(name);
    }
}
class Franchise
{
    Player P1;
    void setName(Player ref)
    {
        P1=ref;
    }
}
class IPL
{
    public static void main(String args[])
    {
        Player Pref=new Player();
        Franchise RCB=new Franchise();
        RCB.setName(Pref);
        RCB.P1.showName();
        Franchise KXIP=new Franchise();
        KXIP.setName(Pref);
        KXIP.P1.showName();
        KXIP=null;
        RCB=null;
        Pref.showName();
    }
}
