package pwo.lab13;

public class Text {

    static boolean cont5Dig(String str) {
        return str.replaceAll("[^0-9]", "").length() == 5;
    }
    
    static int numOfDigits(String str) {
        return str.replaceAll("[^0-9]", "").length();
    }
    
    static boolean notContDigits(String str) {
        return str.replaceAll("[^0-9]", "").length() == 0;
    }
    
    static boolean contOnlyDigits(String str) {
        return str.replaceAll("[^0-9]", "").length() == str.length();
    }
}