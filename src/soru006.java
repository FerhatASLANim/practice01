import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class soru006 {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("dört haneli sayi girin: ");
        int num = girdi.nextInt();


        int son, toplam = 0, ilk_num;
        ilk_num = num;
        for (int i = 0; i < 4; i++) {
            son = num %10;
            num = (num - son) / 10 ;
            toplam += son ;

        }
        System.out.println(ilk_num +" sayisinin basamak değerleri toplamı :" +toplam );
    }
}
