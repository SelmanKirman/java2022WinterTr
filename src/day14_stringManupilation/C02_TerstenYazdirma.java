package day14_stringManupilation;

public class C02_TerstenYazdirma {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin ilk harfi büyük
        // digerleri kucuk olarak tersten yazdirin

        String input="Olga";

        String tersStr = input.substring(input.length()-1,input.length()).toUpperCase() +
                input.substring(input.length()-2,input.length()-1).toLowerCase()+
                input.substring(input.length()-3,input.length()-2).toLowerCase()+
                input.substring(input.length()-4,input.length()-3).toLowerCase();

        System.out.println(tersStr);

    }
}
