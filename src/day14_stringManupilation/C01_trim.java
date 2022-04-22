package day14_stringManupilation;

public class C01_trim {
    public static void main(String[] args) {
        String str = "   Siz ne derseniz deyin, Java bildigini okur.   ";

        System.out.println(str);
        System.out.println(str.length());

        str = str.trim();
        System.out.println(str);
        System.out.println(str.length());

        str="ali okula git \ngit ali git";
        System.out.println(str.trim());
    }
}
