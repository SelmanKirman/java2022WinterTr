package day43_garbage_abstractClass;

public abstract class C03_IlkAbstractClass {


    public abstract void AbstractMethod();
    /*
    Abstract methodlar
    child classlarin MUTLAKA override etmesi gereken methodlardir
    dolayisi ile HICBIR ZAMAN direkt calistirilmazlar
    ve bu sebeple method bodysine ihtiyac yoktur

    bir class'in veya methodun abstract olup olmadigini anlayabilir miyiz ?
    - abstract yaziyorsa abstracttir , yazmiyorsa degildir
    (abstract olmayan class'lara concrete class/method denir)

    Abstract methodlar body'e sahip olamaz
    Concrete methodlar ise method bodysi olmadan olusturulamaz
     */
}
