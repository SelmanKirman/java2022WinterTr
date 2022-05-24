package day32_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println(tarihSaat); // 2022-05-24T13:50:40.044756800

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/YYYY");

        System.out.println(formatter.format(tarihSaat)); // 24/5/2022 // 24/Mayıs/2022

        DateTimeFormatter formatterSaat=DateTimeFormatter.ofPattern("h:mm a");

        System.out.println(formatterSaat.format(tarihSaat)); // 14 : 01 // 02 : 01 // 2 : 10 ÖS

                /*
                format olustururken
                GUN
                d : basta 0 varsa onu yazmadan gun numarasi
                dd : tek haneli gunleri 01 gibi basina sifir yazarak gun numarasini
                DDD : yilin kancinci gunu oldugunu yazar
                E , EE, EEE : gun isminin ilk 3 harfini
                EEEE : gun isminin tamamini

                AY (Ay icin M, dakika icin m kullanilir)
                M : basta 0 varsa onu yazmadan ay numarasi
                MM : tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
                MMM : Ay isminin ilk 3 harfi
                MMMM : Ay isminin tamami

                YY : yilin son iki rakamini
                YYYY : Yilin tamamini


                Saat : ( 24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)



                HH : saatin tamami, tek rakamli saat olursa 02 gibi
                H : tek rakamli saat olursa sadece saati

                hh : 12 saat dilimine gore 2 rakam olarak
                h : 12 saat dilimine gore tek rakam olanlari tek olarak

                m : minute
                mm :

                o yazarsak AM veya PM degerini yazar.

                 */
    }
}
