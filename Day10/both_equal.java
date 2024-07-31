import java.util.*;
class both_equal
{
	public static void main(String arg[]) 
	{
		Scanner sc=new Scanner(System.in);
		String s1;
        System.out.print("Enter the string : ");
		s1=sc.nextLine();
		String s2;
		System.out.print("Enter the string : ");
		s2=sc.nextLine();

		if(s1.equals(s2))
		{
			System.out.print("both are equal ");
		}
		else
		{
			System.out.print("not equal ");
		}

		
	}
}