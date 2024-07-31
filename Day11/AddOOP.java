class Add
{
    int a,b,c;
    
    void get()
    {
        a=12;
        b=23;
    }
    void sum()
    {
        c=a+b;
    }
    void dis()
    {
        System.out.println("Sum of two numbers = "+c);
    }

}
class AddOOP
{
    public static void main (String arg[])
    {
        Add obj=new Add();
        obj.get();
        obj.sum();
        obj.dis();
    }
}