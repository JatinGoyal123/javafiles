class Student
{
    int sub,marks,tot;
    void setSM(int subj,int mark)
    {
        sub=subj;
        marks=mark;
        tot=sub*marks;
    }
    void show()
    {
        System.out.println("Total MArks:"+tot);
    }
}
class Arrayobj
{
    public static void main(String obj[])
    {
        int i,sum=0;
        Student list[]=new Student[3];
        for(i=0;i<list.length;i++)
        {
            list[i]=new Student();
            list[i].setSM(50*(i+1),50*(i+1));
        }
        System.out.println("Marks List:");
        for(i=0;i<list.length;i++)
        {
            list[i].show();
            sum+=list[i].tot;
        }
        System.out.print("Total marks of "+(list.length)+"students="+sum);
        
    }
}