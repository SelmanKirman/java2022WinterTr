package day15_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok zevkli";

        // str'in ilk 4 harfini almak istersek
        str.substring(0,4);

        // Bir program yaparken kodlarimizin daha kisa ve anlasilavilir olmasi icin
        // surekli kullanabilecegimiz kod bloklarini hazir olarak bir yere koyar
        // ihtiyacimiz oldukca oradan alip kullaniriz

        // methodlar robotlara benzer
        // method olusturmka bazen o methodun yapacagi isi yapmaktan zor olabilir
        // bir islemi sadece bir kere yapacaksan method kullanmamiza gerek olmayabilir
        // ancak özellikli cok kullanacagimiz islemler icin
        // her seferinde yeniden ayni kodlari yazmak yerine
        // bu islemi yapan hazir bir method olustururusak cok daha pratiktir

        // bazen bir classin icerisinde cok uzun kodlar yazarsak
        // tum classin anlasilmasi zorlasabilir
        // bunun yerine kodun belli kisimlarini ayri methoflar olarak olusturup
        // main method icresinde istedigimiz sekilde me methodlari yonetebiliriz


    }
}
