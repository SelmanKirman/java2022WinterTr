package day39_overriding;

public class Araba {
    String hareket="Arabalar Teker ile hareket eder";
    String hiz="Arabalar motor gucune gore hiz yapar";
    String yakit="Arabalar farkli yakitlar kullanabilir";
    String marka="Arabalar uretildikleri markaya sahiptir";


    public void motor(){
        System.out.println("Arabalar farkli markalarda motor kullanirlar");
    }

    public void yakitTuketimi(){
        System.out.println("Arabalar motor gucu ve yakit turune gore yakit tuketirler");
    }
}

