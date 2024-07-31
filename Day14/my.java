class sakthi
{
    static int fact=1;
    public static void fact(int n)
{
        for(int i=1;i<n;i++)
        {
            fact*=i;
        }
        System.out.println(fact);
    }
}
class my{
     public static void main(String args[])
   {
      sakthi.fact(5);
   }
}