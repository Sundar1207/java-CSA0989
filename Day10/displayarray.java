import java.util.*;
class displayarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int num=sc.nextInt();
        int arr[]=new int[5];
        int i;

        for( i=0;i<5;i++)
        {
         arr[i]=sc.nextInt();
        } 
         for(i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }
    }
}