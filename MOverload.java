class Person
{
    String id="XYZ";
    String mob="XYZ";
    String landline="XYZ";
    void setDetails(String uid,String m,String ll)    
    {
        id=uid;
        mob=m;
        landline=ll;
    }
    
    void setDetails(String uid,String m)    
    {
        id=uid;
        mob=m;
        
    }

    void setDetails(String uid)    
    {
        id=uid;
    }
    
    void show()
    {
        System.out.println("USer id:"+id);
        System.out.println("Mobile nO:"+mob);
        System.out.println("Landline no:"+landline);
        System.out.println("\n");
    }
    
    
}

class MOverload
{
    public static void main(String[] args)
    {
        Person p1=new Person();
        p1.setDetails("JATIN","84275-30694","230024");
        p1.show();
        
        Person p2=new Person();
        p2.setDetails("SANYAM","79860-57236");
        p2.show();
        
        Person p3=new Person();
        p3.setDetails("Inder");
        p3.show();
    }
}