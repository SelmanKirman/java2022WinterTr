package day17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin
        // Kullancinin girdigi Stringin pralindrome olup olmadigini kontrol eden
        // bir method olusturun
        
        String input = "ey edip adanada pide ye";
        paldindromeKontrolEt(input);
    }

    private static void paldindromeKontrolEt(String input) {

        String terstenInput="";
        for (int i = input.length()-1; i >= 0; i--) {
            terstenInput+=input.charAt(i);

        }

        System.out.println("Girdiginiz kelimenin tersten yazilisi : " + terstenInput);

        if (input.equalsIgnoreCase(terstenInput)) {
            System.out.println("Girdiginiz kelime palindrome");
        } else {
            System.out.println("Girdiginiz kelime palindrom degil");
        }
    }
}
