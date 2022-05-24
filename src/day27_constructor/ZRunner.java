package day27_constructor;

public class ZRunner {
    public static void main(String[] args) {


        Z obj1 = new Z("Emre", "Gulser", 44, true);
        System.out.println(obj1); // Isim : Emre, Soyisim : Gulser, numara : 44

        Z obj2 = new Z("Emre", "Oh", 55);
        System.out.println(obj2); // Isim : Emre, Soyisim : Oh, numara : 55

        Z obj3 = new Z("Ali","Can",50);


    }
}