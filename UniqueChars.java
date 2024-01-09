/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));


    }


    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String theFinal = "";
        int len = s.length()  ;
        for (int i=0 ;i < len ;i++) {
            char currentChar = s.charAt(i);
            if (theFinal.indexOf(currentChar, 0) == -1) {
                theFinal +=currentChar;
                
            }else {
                theFinal += " ";  
                
            }    
        }

        return theFinal;
    }
}
