import java.io.*;
import java.lang.*;
public class serialize {
		public static void main(String[] args)
		{
			inout obj=new inout();
			Product obj1=new Product("dell","laptop","www.dell.com");
			obj.serialization(obj1);
			obj.deserialize();
			
		}
}
class Company implements Serializable
{
	String name;
	String wname;
	Company(String n,String wn)
	{
		name=n;
		wname=wn;
	}
	String getDetails()
	{
		return ("name = "+name+" and web name"+wname);
		//System.out.println("comapny name="+name+"Web name"+wname);
	}
	
}
class Product implements Serializable
{
	String pname;
	Company comp;
	Product(String p,String n,String co)
	{
		pname=p;
		comp=new Company(n,co);	
	}
	
	void showdetails()
	{
		String det="";
		det ="details ="+pname+"and "+comp.getDetails();
		System.out.println(det);
	}
	
}
class inout
{
	void serialization(Product obj1)
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("test1.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(obj1);
			oos.close();
               
               fos.close();
               System.out.println("Serialization Done");
		}
		catch(Throwable ex)
		{
			ex.printStackTrace();
		}
	}
	
	void deserialize()
	{
		try
		{
			 System.out.println("Deserialisation");
			FileInputStream fos=new FileInputStream("test1.txt");
			ObjectInputStream oos=new ObjectInputStream(fos);
			Product pp=(Product)oos.readObject();
			pp.showdetails();
			oos.close();
			fos.close();
		}
		catch(Throwable exx)
		{
			exx.printStackTrace();
		}
	}
}
