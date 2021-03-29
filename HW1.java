class HW1
{
    public static void main(String ary[])
    {
        //float r=10.0f,h=10.0f,volCone,VolCyl;
        int l=20,b=20,t=5,area;
        area=l*b;
        float p=100.0f,ra=10.0f,r=10.0f,h=10.0f,volCone,volCyl,si;
        si=(p*ra*t)/100.0f;
        volCyl=3.14f*r*r*h;
        volCone=volCyl/3.0f;
        System.out.println("SIMPLE INTEREST:"+(si)+"%");
        System.out.println("AREA OF RECTANGLE:"+(area));
        System.out.println("VOLUME OF CYLINDER:"+(volCyl));
        System.out.println("VOLUME OF CONE:"+(volCone));
    }
}