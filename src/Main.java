import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayiyi Giriniz: ");
        int sayi = input.nextInt();
        int adet = 0, toplam = 0;
        while (sayi != 0) {
            toplam = (sayi % 10) + toplam;
            sayi /= 10;
            ++adet;
        }
        System.out.println("Toplam= "+toplam);
    }
}