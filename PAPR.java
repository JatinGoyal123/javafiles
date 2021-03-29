interface Animals
{
    void sound();
}
class Dog implements Animals
{
public void sound()
{
System.out.println("Barking");
}
}
class Tiger implements Animals
{
public void sound()
{
System.out.println("Roar");
}
}
class Cat implements Animals
{
public void sound()
{
System.out.println("Meow-Meow");
}
}

class Robot
{
    void getSound(Animals ref)
    {
        ref.sound();
    }
    
    Animals getName(String name)
    {
        if(name=="TOM")
            return new Dog();
        else if(name=="SHER")
            return new Tiger();
        else if(name=="BILLI")
            return new Cat();
        else
            return null;
    }
}

class PAPR
{
    public static void main(String[] obj)
    {
        Dog dref=new Dog();
        Tiger tref=new Tiger();
        Cat cref=new Cat();
        Robot robo=new Robot();
        robo.getSound(dref);
        robo.getSound(tref);
        robo.getSound(cref);
        
        Animals dd=robo.getName("TOM");
        dd.sound();
        Cat cc=(Cat)robo.getName("BILLI");
        cc.sound();
        Animals d=robo.getName("TOMm");
        d.sound();
        
    }
}