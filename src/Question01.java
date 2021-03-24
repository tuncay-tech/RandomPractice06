import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int sayi = girdi.nextInt();

        switch (sayi) {
            case 1:
                System.out.println("sayı 1 e eşittir");
                break;
            case 2:
                System.out.println("sayı 2 ye eşittir");
                break;
            case 3:
                System.out.println("sayı 3 e eşittir");
                break;
            default:
                System.out.println("geçersiz bir değer giridniz");
                // aralara break koymazssak hepsini gösterir
        }
    }
}
