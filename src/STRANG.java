/**
 * @author Patrick H.
 * @since 2017-9-24
 * @version 1.0
 */
public class STRANG {
    public static void main(String[] args){
        String sentence = new String(" Programming is fun!");
        int number = 14713;
        System.out.println("The original sentence is: '" + sentence + "'");
        System.out.println("What is the Char at 3? - " + sentence.charAt(3));
        System.out.println("Does the original sentence match: 'JAVA is fun!' ? - " + sentence.equals("JAVA is fun!"));
        System.out.println("If the case is ignored, does the original sentence match: ' PRogRaMmiNg IS fuN!' ? - " + sentence.equalsIgnoreCase(" PRogRaMmiNg IS fuN!"));
        System.out.println("What is the index of ram? - " + sentence.indexOf("ram"));
        System.out.println("What is the last index of ' '? - " + sentence.lastIndexOf(" "));
        System.out.println("What if the sentence in all lowercase? - " + sentence.toLowerCase());
        System.out.println("What if the sentence in all uppercase? - " + sentence.toUpperCase());
        System.out.println("What if you replace 'P' with 'B'? - " + sentence.replace("P", "B"));
        System.out.println("What is the substring starting at 10? - " + sentence.substring(10));
        System.out.println("What is the substring from 3 to 8? - " + sentence.substring(3,8));
        System.out.println("What is the string value of integer 14713? - " + String.valueOf(number));
        System.out.println("What is the original sentence when trimmed? - '" + sentence.trim() + "'");
    }
}
