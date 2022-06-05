package day36_inheritance;

public class Memur extends Muhasebe{

    public static void main(String[] args) {


        Memur memur1= new Memur();
        // memur1 objesi Memur classinin objesi olmasina ragmen
        // inherit ettigi Muhasebe ve onun da Parent i olan Personal
        // class'larindaki tum daralari alabilir

        // Persinal classindan
        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepecik";
        memur1.adres="Ankara";
        memur1.tel="3125756595";

        // Muhasebe classindan
        memur1.saatUcreti=10;
        memur1.maas= memur1.maasHesapla();
        memur1.statu="Memur";
        System.out.println(memur1);

        Memur memur2=new Memur();
        memur2.persNo=1002;
        memur2.saatUcreti=10;
        memur2.maas= memur2.maasHesapla();

        System.out.println(memur2);

    }

    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
