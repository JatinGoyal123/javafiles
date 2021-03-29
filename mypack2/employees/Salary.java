package mypack2.employees;
    public class Salary
    {
        float bs,da,hra,gross;
        public void setSal(float bs)
        {
            this.bs=bs;
        }
        public float getSal()
        {
            da=bs*50/100;
            hra=bs*30/100;
            gross=bs+hra+da;
            return (gross);
        }
            
    }