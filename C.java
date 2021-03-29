/*
interface A
   {	
	int x = 10;
   }
interface B
   {
	int y = 20 + A.x;	// Using variable of interface A
   }
class C
   {
	public static void main(String args[])
	    {
		int z = A.x + B.y;
		System.out.println(z);
	    }
   }
//==-=----------------
interface A
   {	
	void fun();
   }
interface B
   {
	void fun();
   }
class C implements A, B
   {
	public void fun() //overridden once
	    {
		System.out.println("Hello");
        }
    public static void main(String[] args)
    {
    C cref=new C();
    cref.fun();
    }
}
*/


interface a
{
    void fun();
    
}
interface b
{
    void fun();
}

interface d extends a,b
{
void fun();
}
class C implements d
{
public void fun()
{
System.out.println("Hello");
}
public static void main(String[] args)
{
C cref=new C();
cref.fun();
}
}