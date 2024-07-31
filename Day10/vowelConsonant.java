import java.util.*;
class vowelConsonant
{
	public static void main(String arg[]) 
	{
		Scanner sc=new Scanner(System.in);
		char ch;
        System.out.print("Enter the Character : ");
        String s=sc.nextLine();
        ch=s.charAt();

	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
	System.out.println("It is Vowel");
	}
	else
	{
	System.out.println("It is Consonant ");
	}
	}
} 