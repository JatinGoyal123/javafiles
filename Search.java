/*import java.util.Scanner;
class Search
{
    public static void main(String[] args)
    {
        int n,i,item;
        System.out.print("Enter size of array:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        int[] ary=new int[n];
        for(i=0;i<ary.length;i++)
        {
            System.out.print("ENter element");
            ary[i]=obj.nextInt();
        }
        Process ref=new Process();
        System.out.println("Enter item to search");
        item=obj.nextInt();
        ref.getItem(ary,item);
    }
}
class Process
{
    int i;
    int count=0;
    void getItem(int[] A,int s)
    {
        for(i=0;i<A.length;i++)
        {
            if(s==A[i])
            {
                s=A[i];
                System.out.println("Number FOund:"+s+"at position="+i);
                count++;
       
            }
      }
        if(count==0)    
        {
            System.out.println("Item not in array");
        }
            
    }
}*/
import java.util.Scanner;
class Search
{
    public static void main(String[] args)
    {
        int n,i,item;
        System.out.print("Enter size of array:");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        int[] ary=new int[n];
        for(i=0;i<ary.length;i++)
        {
            System.out.print("ENter element");
            ary[i]=obj.nextInt();
        }
        Process ref=new Process();
        int ele=ref.getItem(ary);
        System.out.print(ele);
    }
}
class Process
{
   
    int getItem(int[] A)
    {
         int i;
    int elem,e;
    Scanner obj=new Scanner(System.in);
    e=obj.nextInt();
        for(i=0;i<A.length;i++)
        {
            if(e==A[i])
            {
                e=A[i] ;   
            }
      }
        return (e);    
    }
}