import mypack.decisions.*;
import mypack.loops.SumN;
import static mypack.Shapes.line;



class usePack
{
    public static void main(String[] args)
    {
        line();
        Max2 ref=new Max2();
        int mx2=ref.getMax2(10,20);
        System.out.println("Maximum of two no's="+mx2);
        
        Max3 ref1=new Max3();
        int mx3=ref1.getMax3(11,22,33);
        System.out.println("Maximum of three no's="+mx3);
        
        mypack.loops.FactorialN ref2=new mypack.loops.FactorialN();
        int fac=ref2.getFact(5);
        System.out.println("Factorial of 5 ="+fac);
        
        SumN ref3=new SumN();
        int sum=ref3.getSum(5);
        System.out.println("Sum ="+sum);
        mypack.Shapes.dbline();
        
        
    }
}