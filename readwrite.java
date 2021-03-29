import java.io*;
class Company implements Serializable
{
    String name,website;
    Company(String n,String ws)
    {
    name=n;
    website=ws;
    }
    String getDet()
    {
    return "company name"+name+"Website name"+website;
    }
}
class Serialisation
{
    void serialiseobj(Company c)
    {
         try
		{
			FileOutputStream fos=new FileOutputStream("test1.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(c);
			oos.close();
               fos.close();
               System.out.println("Serialization Done");
		}
		catch(Throwable ex)
		{
			ex.printStackTrace();
		}
    }
   
}