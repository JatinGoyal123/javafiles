class CONTI
{
    public static void main(String obj[])
    {
        label:
        for(int i=4;i<=5;i++)
        {
            for(int j=7;j<=10;j++)
            {
                if(j==9)
                    continue label;
                System.out.println("i:"+i+",j:"+j);
            }
            System.out.println("--------------------");
        }
    }
}

//=--=-=-=---=-=--==-==-==-==-=-=-=-=-=-
/*
class CONTI
{
    public static void main(String obj[])
    {
        outer://label
        for(int i=4;i<=7;i++)
        {
            for(int j=7;j<=10;j++)
            {
                if(j==9)
                break outer;
                System.out.println("i:"+i+",j:"+j);
            }
            System.out.println("--------------------");
        }
    }
}
*/

/*class CONTI
{
    public static void main(String obj[])
    {
        int n=5,i=1;
        System.out.println("Table Of 5:");
        System.out.println("");
            do{
                int pro=n*i;
                System.out.println(n+"*"+i+"="+pro);
                i++;
            }while(i<=10);
    }
}*/

