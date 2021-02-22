import java.util.Scanner;

public class soru04 {
    public static void main(String[] args) {
        int not;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Aldığınız notu giriniz :");
        not = girdi.nextInt();
        if (not <= 100 && not <= 50) {
            System.out.println("adam gibi not giriniz ");}
            else if (not < 50) {
                System.out.println("D");
            } else if (not < 70) {
                System.out.println("C");
            } else if (not < 85) {
                System.out.println("B");
            } else if (not <= 100) {
                System.out.println("A");
            }
        }
    }
