class stringtest1
{
	public static void main(String arg[]) 
	{
		String s1 = "I Love java";
		String s2;
		int i;
		s2 = s1.toLowerCase();
		System.out.println(s2);
		s2 = s1.toUpperCase();
		System.out.println(s2);
		s2 = s1.replace('o','i');
		System.out.println(s2);
		s2=s1.trim();
		System.out.println(s2);
		s2=s1.substring(2);
		System.out.println(s2);
		s2=s1.substring(2,6);
		System.out.println(s2);
		i=s1.indexOf('L');
		System.out.println(i);
		s2=s1.substring(7);
		System.out.println(s2);
        i=s1.indexOf('j');
        System.out.println(i); 
        s2=s1.substring(3,5);
		System.out.println(s2);
        i=s1.indexOf('o');
        System.out.println(i);
        char s=s1.charAt(5);
		System.out.println(s);
		
	}
}