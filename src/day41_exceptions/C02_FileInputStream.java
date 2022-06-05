package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_FileInputStream {
    public static void main(String[] args)  {
        /*
        Bir kod yazilirken olasi exceptionlar ongorulup
        exception olustugunda javanin ne yapmasini istedigimiz
        belirtilmelidir

        1- Eger exception olustugunda kodun calismaya devam etmesini istemiyorsak
        method isminin yanina olusabilecek exceptioni deklare edebiliriz
        2- Eger exception olussa da kodun calismaya devam etmesini istiyorsak
        sorun olusturabilecek kodu try catch blogunun icine alir
        try bloguna sorun cikabilecek kodu
        catch blogunun olusabilecek exceptioni ve
        olasi exception durumunda Javanin ne yapmasini istedigimizi yazabiliriz
         */
        String dosyaYolu="src/day40_exceptions/dosya.text";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
