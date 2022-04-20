package day10_switch_StringManupilation;

public class C03_Concate {

    public static void main(String[] args) {

        // Concatenation yapmak icin iki ihtimal var
        // istersek daha once yaptigimiz gibi + operatorunu kullanabiliriz
        // veya string classindan gelen concat methodunu kullanabiliriz


        String str1="Java";
        String str2="Candir";

        // Java Candir yazdiralim

        System.out.println(str1+ " " + str2);

        String cumle=str1.concat(str2); //JavaCandir

        cumle = str1.concat(" ").concat(str2);

        System.out.println(cumle);


        // concat icine String degil de sayi veya boolean deger yazsak ?
        // concat methodu icine String parametre ister
        // String disinda bir data turu yazdiginizda onu String haline getirmelisiniz
        cumle=str1.concat(""+ 5);
        cumle=str1.concat(true+"");

    }
}
