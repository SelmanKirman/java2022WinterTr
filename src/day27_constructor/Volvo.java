package day27_constructor;

public class Volvo {

    String marka="Volvo";
    String mensei="Isvec";
    String model;
    boolean elektrikliMi;
    int yil;
    String yakit;
    boolean otomatikPilot=OtomatikPilotSorgusu();
    int maxHiz=maxiHizAta();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {
       model=mdl;
       elektrikliMi=elk;
       yil=yl;
       yakit=ykt;
       maxHiz=maxiHizAta();
       otomatikPilot=OtomatikPilotSorgusu();
    }
    public Volvo(){

    }


    private int maxiHizAta() {
        int maxHiz=0;
        System.out.println("soru : " + elektrikliMi);
        if (elektrikliMi) {
            maxHiz=160;
        } else {
            maxHiz=240;
        }
        return maxHiz;
    }

    public boolean OtomatikPilotSorgusu() {
        boolean sonuc=false;

        if(elektrikliMi) {
        sonuc=true;
        }
        return sonuc;
    }

    public String toString(){
        String arabaOzellikleri= "Model : " + model +
                                 " Yakit : " + yakit +
                                 " Max Hiz : " + maxHiz;

        return  arabaOzellikleri;
    }


}
