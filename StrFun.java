class StrFun
{
    public static void main(String[] args)
    {
/*        String ss="hello java hello programmers";
        //String[] sa=ss.split(" ");
        String[] sa=Pattern.compile(" ").split(ss);
        for(String v: sa)
            System.out.println(v);
    }*/
        byte[] b={65,66,67,68};
        String st=new String(b,1,2);
        System.out.println(st);
    }
}