package day34_accessModifier_encapsulation;

public class C01 {
    private static int sayi=10;
    private static String str="Java";
    static int acikSayi=20; // Access modifier default access modifier
    String acikString="Mi"; // // Access modifier default access modifier
    public static int halkaAcikSayi=15;
    protected static int aileyeOzel=40;
    protected C01(){
        // bu cons access modifieri
        // default a.m
        // dolayisiyla icinde oldugumuz paketin disinda
        // bu class'dan obje olusturulamaz
    }

    private  C01(int numara){
        System.out.println("parametreli cons calisti");
    }

    private void method1(){

    }
}
