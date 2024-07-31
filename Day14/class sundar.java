class sundar
{
    static int n=10,fact=1;
    public static void fact(){
        for(int i=1;i<n;i++)
        {
            fact*=i;
        }
        System.out.println(fact);
    }
}
class my{
      sundar.fact();
}