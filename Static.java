class Student
{
    static int count=0;
    Student()
    {
        count++;
    }
    static void show()
    {
        System.out.println("No of Instances:"+count);
    }
}
class Static
{
    public static void main(String[] args)
    {
        Student s1=new Student();
        Student s2=new Student();
        s1.show();
        s2.show();
        Student.show();
        Student s3=new Student();
        Student s4=new Student();
        Student.show();
        
        
    }
}