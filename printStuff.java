public class printStuff{
import static java.lang.System.out;
/**
  ToDo:
    Make array output
    Make number output a letter
    New Line when printing an array
    Salt output of single string
    pepper output of single string
    output count of the array line used.
**/

  print("hello world");
  String[] wordArray = ['a','b','c'];
  print(wordArray);
  
  public static void print(String inStr)
  {
    System.out.print(inStr);
  }

  
  public static void print(String[] inArr){
    int len = inArr.length;
    for(int i = 0; i < len; ++i)
    {
      print(inArr[i]); 
    }
  }
  
}
