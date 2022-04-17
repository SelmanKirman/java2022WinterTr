package day05_matematikselslemler;

public class C01_PreincrementPostincrement {
    public static void main(String[] args) {

        int sayi=10;

        sayi++;
        System.out.println(sayi); //

        sayi++;
        System.out.println("pre-incrementten once " + sayi);//11



        System.out.println("pre-increment satirinda " + ++sayi);// 13
        System.out.println("pre-incrementten sonra " + sayi); // 13

        System.out.println("post increment satirinda " + sayi++);//13
        System.out.println("post increment satirinda " + sayi);//14
    }
}
