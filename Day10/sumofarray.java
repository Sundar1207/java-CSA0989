import java.util.*;
class sumofarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" array size is 5 ");
        int arr[]=new int[5];
        int i,sum=0;

        for( i=0;i<5;i++)
        {
         arr[i]=sc.nextInt();
         sum+=arr[i];
        } 
        System.out.print("Sumof array = "+sum);

    }
}