class PRRR
{
    public static void main(String args[])
    {
        Imag I1=new Imag();
        Imag I2=new Imag();
        I1.setData(4,5.0f);
        I2.setData(5,6.5f);
        Imag I3=I1.addImag(I2);
        I3.show();
    }
}
class Imag
{
    int real;
    float img;
    void setData(int r,float f)
    {
        real=r;
        img=f;
    }
    void show()
    {
        System.out.println("SUM oF COmplex Numbers is="+real+"+"+img+"i");
        
    }
    Imag addImag(Imag I)
    {
        Imag obj=new Imag();
        obj.real=real+I.real;
        obj.img=img+I.img;
        return obj;
    }
}