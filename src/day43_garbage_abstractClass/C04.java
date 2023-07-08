package day43_garbage_abstractClass;

public abstract class C04 {
    /*
    bir abstract class da abstract veya concrete methodlar bulunabilir
    Child Classlarin abstract methodlari override etmesi MECBURI iken
    concrete methodlarin override edilmesi OPSIYONEL'dir.
     */

    public abstract void absMethod();

    public static void concreteStaticMethod() {
        System.out.println("C04 concrete static method");
    }

    public static void main(String[] args) {
        /*
        Abstract classlar constructor a sahiptir
        ancak Abstract classlardan OBJE olusturulamaz

        Abstract classlar OBJE BARINDIRMAYAN
        sadece child classlar icin
        UYULMASI SART OLAN veya OPSIYONEL birakilan
        ozellikleri tanimladigimiz bir depo class gibidir.
         */
        // C04 obj = new CO4();#
        System.out.println("Bu class abstract");
        concreteStaticMethod();
    }
}
