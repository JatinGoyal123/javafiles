class JSG3
{
    public static void main(String obj[])
    {
        //int x;//error uninitialised
        int x=2,y;
        System.out.println(x);
        if(true)//works only on true and false.
        System.out.println("a");
        else
        System.out.println("b");
        //if(x<=10)
        //{
          //  a=10;
        //}
        //System.out.println(a);error because conditional initialisation not allowed.--=-==-
        int t=7,s;
        if(t<=10)
            s=10;
        else
            s=11;
        System.out.println(s);
        //=-=-=-=-=-=-==-=-===----=-=
        byte b=50;
        int a=b;//we can convert small datatypes to large ones.
        System.out.println(a);
        //-=-=-==-=-==--==-=-=-=-=--==--=-=-=-==-=-=--=-=-=
        byte b1=12;
        byte b2=50*2;
        byte b3=(byte)129;
        byte b4=(byte)(b1*2);
        byte p=4;byte q=126;
        p+=q;
        System.out.println(p);
        System.out.println(b2);
        System.out.println(b4);
        System.out.println(b3);
    }
}