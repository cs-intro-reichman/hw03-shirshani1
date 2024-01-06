/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
        String theFinal = "";
        int len = str.length()  ;
        for (int i=0 ;i < len ;i++) {
            char currentChar = str.charAt(i);
            if ((currentChar > 64) && (currentChar < 91)) {
                currentChar+= 32;
                theFinal += currentChar;
            } else if (currentChar == ' ') {
                theFinal += ' ';
            }
            else theFinal += currentChar;       
            
        }
          System.out.println(theFinal);
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        // Replace the following statement with your code
        return null;
    }
}