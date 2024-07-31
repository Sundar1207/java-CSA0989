class fahrenheit
{
    double fahrenheit,c;
   
   void get()
   {
    fahrenheit=110.5;
   }
   void dis()
   {
    c=(fahrenheit-32)*5/9;
    System.out.println("fahrenheit to celsius ="+c);
   }
}
class fahrenheitOOP
{
    public static void main(String args[])
    {
        fahrenheit obj=new fahrenheit();
        obj.get();
        obj.dis();
    }
}
