package day38_inheritance_overriding;

public class Isci extends Personal{
    public String statu="Isci";
    public String haklar="Isciler kidem tazminati alirlar";
    public String ikramiye="Isciler yilda 1 ikramiye alir";


    public void mesai(){
        System.out.println("Tum isciler haftalik 40 saat calisir");
    }

    public void maasHesapla(){
        System.out.println("Tum personal 30 gun * 8 saat * 11 euro = " + (30*8*11) + "Euro maas alir");
    }
}
