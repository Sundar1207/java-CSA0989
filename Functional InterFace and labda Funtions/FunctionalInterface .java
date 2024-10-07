// using for functional programing
// Anonymous funtions or methodes (closunes)=> nameless
// remove the methode name -- public void (){System.out.println("It is a functional interfase ");};
// remove the return type -- public (){System.out.println("It is a functional interfase ");};
// remove access modifier -- (){System.out.println("It is a functional interfase ");};
// using ( -> ) now   ()->{System.out.println("It is a functional interfase ");};
//  only one aabstatct methods kku than panna mudiyum , like that interface within abstract 



interface a 
{
    static void main(int a , int b)
    {
        System.out.println("Sum of two numbers : "+(a+b));
        rule2();
    }
    private static void rule2()
    {
        System.out.println("Hello java ");
    };
    
    
    public void rule();// its a narmal abstract methods
}
public class FunctionalInterface 
{
    public static void main(String[] arg )
    {
        a.main(12,12);
        
        a o = ()->{System.out.println("It is a functional interfase ");}; // a=> <interface name> <object name> = ()->{System.out.println("It is a functional interfase ");};
        o.rule();  // o is obj and rule call by interface laa oolla rule() methods 
    }
}
