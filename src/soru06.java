import java.util.Scanner;

public class soru06 {
    public static void main(String[] args) {
        int sayi;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Dört haneli sayı girin: ");
        sayi = girdi.nextInt();
        String sayii = String.valueOf(sayi);
        int birinci_int = Integer.parseInt(String.valueOf(sayii.charAt(0)));
        int ikinci_int = Integer.parseInt(String.valueOf(sayii.charAt(1)));
        int ucuncu_int = Integer.parseInt(String.valueOf(sayii.charAt(2)));
        int dorduncu_int = Integer.parseInt(String.valueOf(sayii.charAt(3)));
        int toplam = birinci_int + ikinci_int + ucuncu_int + dorduncu_int;
        System.out.println("toplamı " +toplam);

    }
}
