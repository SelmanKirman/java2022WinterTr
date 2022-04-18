package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

        // kullanicidan yasini isteyin
        // 65 veya daha buyukise emekli olabilirsin
        // 65 den daha kucukse emekli olamazsin yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();


        if (yas>=65) {
            System.out.println("emekli olabilirsin");
        } else {
            System.out.println("emekli olamazsin");
            System.out.println(65-yas + " sene daha calismalisin");
        }

        // if else statementlarda iki durumdan sadece ve sadece biri calisir
        // ikisinin birden calisma ihtimali yoktur
        // ikisinin de calismama ihtimali yoktur

    }
}
