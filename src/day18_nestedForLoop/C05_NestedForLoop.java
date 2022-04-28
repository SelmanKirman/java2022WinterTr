package day18_nestedForLoop;

public class C05_NestedForLoop {

    public static void main(String[] args) {

        /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        seklini yazdiniriz 65=A nin ascii degeri
         */


        for (char i  = 65; i <= 70; i++) {
            for (int j = 65; i-j >= 0 ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        char input = 'L';

        for (char i = 'A'; i <= input ; i++) {
            for (char j = 'A'; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
}
