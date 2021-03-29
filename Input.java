/*import java.util.Scanner;
class Input
{
    public static void main(String obj[])
    {
        Scanner ref=new Scanner(System.in);//creation of obj of scanner class
        System.out.print("Enter ur roll no:");
        int rollno=ref.nextInt();
        System.out.print("Enter ur percentage:");
        float per=ref.nextFloat();
        ref.nextLine();//Dummy variable eats entered space
        System.out.print("Enter ur name:");
        String name=ref.nextLine();
        System.out.println("Ur Roll nO:"+rollno);
        System.out.println("ur Percentage:"+per);
        System.out.println("ur Name:"+name);
    }
}*/
import java.util.*;
class Input
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("ENter a:");
        int a=obj.nextInt();
        System.out.print("ENter b:");
        int b=obj.nextInt();
        System.out.print("ENter c:");
        int c=obj.nextInt();
        int sum=a+b+c;
        System.out.print("SUM:"+sum);
    }
}