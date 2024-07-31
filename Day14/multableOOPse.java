
class overload 
{

    String one;
    String two;
    int num,i;
    void overload()
    {
    
            System.out.println("Welcome to java");
        
    }
    void overload(String a)
    {
         one=a;
    
        {
            System.out.println(one+" \n "+one);
        }
    }
    void overload(int b,String c)
    {
        num=b;
        two=c;
        {
            for (i=0;i<b;i++){
            System.out.println(two);
}
        }
    }
}
class multableOOPse
{
    public static void main(String args[])
    {
        overload obj=new overload();
        obj.overload();
        obj.overload("Welcome to overload");
        obj.overload(3,"Welcome to polymorphism");
       
    
    }
}