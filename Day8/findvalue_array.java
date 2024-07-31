import java.util.*;
class findvalue_array
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println(" array size is 5 ");
    int arr[]=new int[10];
    int i;

    for( i=1;i<=5;i++)
    {
    arr[i]=sc.nextInt();
    } 

    //value in put 
    System.out.println("Enter the yours value ");
    int value=sc.nextInt();

    for( i=1;i<=5;i++)
    {
    if(arr[i]==value);
    {
    int f=1;
    break;
    }
    } 
    if(f==1);
    {
    System.out.println("that value possition is ="+i);
    break;
    }
    else
    {
    System.out.println("this value is not there");
    }
    }
}