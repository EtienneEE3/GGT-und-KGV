import java.util.*;

public class GGTRechner{
    public static int ggt(int EineZ, int ZweiteZ) {
        int h = (EineZ > ZweiteZ) ? EineZ: ZweiteZ;
        for(int i = h; i > 1; i--) {
            if ((EineZ % i) == 0 && (ZweiteZ % i ) == 0) {
                return i;
        }
        }
        return 1;
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie die Erste Zahl ein: ");
        int ErsteZ= s.nextInt();
        System.out.println("Geben Sie die Zweite Zahl ein: ");
        int ZweiteZ= s.nextInt();
        System.out.println("Das GGT von "+ ErsteZ +" "+ ZweiteZ +" ist " + GGTRechner.ggt(ErsteZ, ZweiteZ)+".");
    }
}