/*
class CommLineArgs
{
    public static void main(String[] args)
    {
        for(int i=0;i<args.length;i++)
        {
            
        }
        for(String i: args)
        {}
        System.out.println(args.length);
        
    }
}

//class CommLineArgs
//{
//    public static void main(String[] args)
//    {
//        String x="3";
//        String y="2";
//        int z=Integer.parseInt(x)+Integer.parseInt(y);
//        System.out.println(z);
//        String a="3.5";
//        float f=Float.parseFloat(a)+7;
//        System.out.println(f);
//        
//    }
//}

*/

class CommLineArgs
{
    public static void main(String[] args)
    {
        if(args.length!=3)
        {
            System.out.println("Must be 3 arguements");
        }
        else
        {
            float p=Float.parseFloat(args[0]);
             float r=Float.parseFloat(args[1]);
             float t=Float.parseFloat(args[2]);
            float si=p*r*t/100;
            System.out.println("Simple interest:"+si);;
        }
    }
}