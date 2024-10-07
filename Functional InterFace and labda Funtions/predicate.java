// using import.java.util .function.Predicate or import java.util.function.* ;
// it is a java interface functional
// method name is test ;
// Predicate <type or collections> obj = ()-> contions;
// only boolean and one argument methods.
import java.util.function.Predicate;
class predicate
  {
    public static void main(String[] args)
    {
      Predicate<Integer> obj = age -> age>=18;
      System.out.println(obj.test(14));
    }
  }
