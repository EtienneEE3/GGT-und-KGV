import java.util.*;

public class KGV{
     public static int ggt(int EineZ, int ZweiteZ) {
        int Bedingung = (EineZ > ZweiteZ) ? EineZ: ZweiteZ;
        for(int i = Bedingung; i > 1; i--) {
            if ((EineZ % i) == 0 && (ZweiteZ % i ) == 0) {
                return i;
            }
       }
        return 1;
    }
    public static int kgv(int ZahlE, int ZahlZ ) {
        var rechnung = (ZahlE * ZahlZ) / KGV.ggt(ZahlE, ZahlZ);
        return rechnung;
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein: ");
        int ErsteE = sc.nextInt();
        System.out.println("Geben Sie eine Zahl ein: ");
        int ZweiteE = sc.nextInt();
        System.out.println("Das KGV von "+ ErsteE +" "+ ZweiteE +" ist "+ KGV.kgv(ErsteE, ZweiteE) +".");
    }
}