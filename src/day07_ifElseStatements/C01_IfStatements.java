package day07_ifElseStatements;

public class C01_IfStatements {

    public static void main(String[] args) {


        int a = 2;
        int b = 3;

        if(a==b){

            System.out.println("verilen sayilar esit");
        }

        if (a>100) {
            System.out.println("a yuzden buyuk");
        }

        if (a*b> 1) {
            System.out.println("sayilari carpimi 5 ten buyuk");

        }
        // bagimsiz if cumleleri kendileri disindaki kodlarla ilgilenmezler
        // bir sart ve o sarta bagli sonuca odaklidir
        // birden fazla bagimsiz if cumlesi oldugunda hepsinin bodysi calisabilecegi gibi
        // hicbirinin bodysi de calismayabilir
    }
}
