package fuda.edu;

public class PalindromeService {

    private String string;

    // regex to clean non alphabetic and non cyrillic symbols
    private static final String regex = "[^a-zA-Zа-яА-Я]";

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public PalindromeService() {
    }

    public PalindromeService(String string) { this.string = string;}

    private void toLowerCase() {
        this.setString(this.string.toLowerCase());
    }

    private void getCleanedString(){
        this.setString(this.string.replaceAll(regex, ""));
    }

    private String getReversed(){
        return new StringBuilder (string).reverse().toString();
    }

    /*public Boolean isValid(){
        toLowerCase();
        getCleanedString();
        return this.getString().equals(this.getReversed());
    }*/

    public static Boolean isValid(String string) {
        if (string == null) return null;
        PalindromeService palindromeService = new PalindromeService(string);
        palindromeService.toLowerCase();
        palindromeService.getCleanedString();
        if (palindromeService.getString().length() == 0) return null;
        return palindromeService.getString().equals(palindromeService.getReversed());
    }
}
