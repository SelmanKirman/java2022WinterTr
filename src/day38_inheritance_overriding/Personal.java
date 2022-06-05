package day38_inheritance_overriding;

public class Personal {

    public String statu="Personal";
    public String haklar="Tum personal esit haklara sahiptir";
    public String izin="Tum personal yilda 4 hafta izin kullanabilir";


    public void mesai(){
        System.out.println("Tum personal 5 gun, gunde 8 saat calisir");
    }

    public void maasHesapla(){
        System.out.println("Tum personal 30 gun * 8 saat * 10 euro = " + (30*8*10) + "Euro maas alir");
    }

}
