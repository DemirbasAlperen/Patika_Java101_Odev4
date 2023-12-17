// Taksimetre Programı :
import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        int km, startPrice = 10;         // startPrice : "başlangıç ücreti" anlamına gelir.
        double perKm = 2.20, total;     // perKm = "Km başına" anlamına gelir.

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Km Cinsinden Giriniz : ");
        km = input.nextInt();
        System.out.println("Taksimetre Açılış Ücreti : " + startPrice);
        System.out.println("Km Başına Ücret : " + perKm);

        total = (km * perKm) + startPrice;
        total = (total < 20) ? 20 : total;       // Minimum ödenecek tutar 20 Tl dir.
        System.out.println("Ödenecek Tutar : " + total);

    }
}
