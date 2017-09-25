/**
 * @author Patrick H.
 * @since 2017-9-24
 * @version 1.0
 */
public class STRANGBUFFBUILD {
    public static void main(String[] args){
        //String Buffer Piece
        StringBuffer strbuf = new StringBuffer("Hello There");
        System.out.println("The original string is: " + strbuf);
        System.out.println("The capacity of the sting is: " + strbuf.capacity());
        System.out.println("The length of the string is: " + strbuf.length());
        System.out.println("If you replace 'Hello' with 'Hi': " + strbuf.replace(0,5,"Hi"));
        System.out.println("If you append 'Friend' to the end of the new string: " + strbuf.append(" Friend"));

        System.out.println("\n");
        // intermediary space

        //String Builder Piece
        StringBuilder strbil = new StringBuilder("I love Java");
        System.out.println("The original string is: " + strbil);
        System.out.println("The capacity of the sting is: " + strbil.capacity());
        System.out.println("The length of the string is: " + strbil.length());
        System.out.println("If you replace 'love' with 'like': " + strbil.replace(2,6,"like"));
        System.out.println("If you append 'a lot' to the end of the new string: " + strbil.append(" a lot"));

    }
}
