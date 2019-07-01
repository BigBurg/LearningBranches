public class printStuff{
import static java.lang.System.out;
/**
  ToDo:
    Salt output of single string
    pepper output of single string
    output count of the array line used.
**/

  print("hello world");
  String[] wordArray = ['a','b','c'];
  print(wordArray);
  print(3);
  
  public static void print(String inStr)
  {
    System.out.println(inStr);
  }

  
  public static void print(String[] inArr){
    int len = inArr.length;
    for(int i = 0; i < len; ++i)
    {
      print(inArr[i]); 
    }
  }
  
  public static void print(int inNum)
  {
    String[] abcs = ["a","b","c","d","e",
                     "f","g","h","i","j",
                     "k","l","m","n","o",
                     "p","q","r","s","t",
                     "u","v","w","x","y",
                     "z"];
    inNum = inNum%26;
    print(abcs[inNum]);
  }
  
}
