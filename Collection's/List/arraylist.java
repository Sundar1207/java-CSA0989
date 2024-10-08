import java.util.*;
public class list
{
    public static void main(String[] arg)
    {
        List numbers = new ArrayList();
        //  --> ("<list name >.add(data or value ) :");
        numbers.add(23);
        numbers.add(2);
        numbers.add("Sundar");
        System.out.println(" Array Lists "+numbers);
        
        // --> ("<list name >.get(index) : "+numbers.get(0));
        System.out.println(" index : "+numbers.get(0));
        
        // --> (" <list name >.set(index, value)");
        System.out.println(" update of index: "+numbers.set(1,"thols"));
        System.out.println(" array list : "+numbers);
        // --> (" <list name >.remove(index));
        numbers.remove(0);
        System.out.println(" array list : "+numbers);
        //  --> create boolean is data type and tf is variable 
        //  --> // --> (" <list name >.cantains(values));
        boolean tf = numbers.contains("Sundar");
        System.out.println(" Boolean conatains :"+ tf);
    }
}
