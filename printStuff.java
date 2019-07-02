public class printStuff{
import static java.lang.System.out;
/**
  ToDo:
    Salt output of single string
    pepper output of single string
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
    int x = 0;
    for(int i = 0; i < len; ++i)
    {
      x = i + 1;
      print(x + ". " + inArr[i]); 
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
