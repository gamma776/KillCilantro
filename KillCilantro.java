public class KillCilantro {
 public static String killCilantro(String str) { 
  while (str.indexOf("cilantro") >= 0) {
   
   String firstPart = str.substring(0, str.indexOf("cilantro"));
   String secondPart = str.substring(str.indexOf("cilantro")+8);
   str = firstPart + "parsley" + secondPart;
   } 
   return str;
   }
   public static String killCilantro(String str, String badWord, String replacer) { 
   while (str.indexOf(badWord) >= 0) {
    String firstPart = str.substring(0, str.indexOf(badWord));
   String secondPart = str.substring(str.indexOf(badWord) + badWord.length());
   str = firstPart + replacer + secondPart;
   }
   return str;
   }
   

  public static void main(String[] args) { 
  
System.out.println(killCilantro("testcilantrotest"));
System.out.println(killCilantro("cilantrotest"));
System.out.println(killCilantro("nothinghere"));
System.out.println(killCilantro("testcilantro"));
System.out.println(killCilantro("pickles are not good", "not", "very"));


}
}