public class KillCilantro {
 public static String killCilantro(String str) { 
 String temp = str.toLowerCase(); 
  while (temp.indexOf("cilantro") >= 0) {
   
   String firstPart = temp.substring(0, temp.indexOf("cilantro"));
   String secondPart = temp.substring(temp.indexOf("cilantro")+8);
   temp = firstPart + "parsley" + secondPart;
   } 
   return temp;
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
System.out.println(killCilantro("cilantrocilantrocilantro"));
System.out.println(killCilantro("pickles are not good", "not", "very"));
System.out.println(killCilantro("this cilantro is proof cilantro that the second method cilantro doesnt mess cilantro with the first one cilantro"));

System.out.println(killCilantro("testCilantrotest"));
System.out.println(killCilantro("testCiLaNtRotest <- cilantro had capitals in it"));




}
}