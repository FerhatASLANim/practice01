import java.util.Scanner;

public class soru02 {
    public static void main(String[] args) {
        int sayi_ilk, sayi_son;
        Scanner girdi_1 = new Scanner(System.in);
        System.out.println("Bir sayı giriniz  :");
        sayi_ilk= girdi_1.nextInt();

        System.out.println("İkinci sayıyı giriniz :");
        sayi_son= girdi_1.nextInt();
        for (int i = sayi_ilk; i <= sayi_son; i++) {
            if (i % 2 == 0){
                System.out.print( i +" ");
        }

    }
}}
