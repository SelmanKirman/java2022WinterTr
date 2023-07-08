package day42_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {

    public static void main(String[] args) {

        String dosyaYolu="src/day40_exceptions/dosya.text";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            int k = 0;
            while((k=fis.read() )!=-1) {
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) { //FileNotFoundException e
            e.printStackTrace();
        }  catch (IOException   e) {//IOException e
            e.printStackTrace();
        }

        /*
        Alti kirmizi cizili her kod CTE degildir
        Java syntax hatalarinin derleme esnasinda (compile) farkeder ve altini cizer
        biz bu gune kadar tamamina CTE diyorduk ancak
        exception konusu ile birlikte
        Compile Time Exception kavrami da hayatimiza girdi
         */

        /*
        Exceptionlar icin de parent child iliskisi mevcuttur
        Eger bir kod icin birden fayla exception olusma ihtimali varsa
        Oncelikle olasi exceptionlar parent-child iliskisi tasiyor mu bakmamiz gerekir
        Eger parent child iliskisi yoksa istedigimiz sirada catch cumleleri olusturabilriz
         */

        /*
        Eger parent child iliskisi varsa
        sadece parent exception i yazabiliriz
        veya ikisini de yazmak istersek
        childi once parenti sonra yazmaliyiz
         */


    }
}
