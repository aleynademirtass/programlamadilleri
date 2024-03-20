import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Programlamadilleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> ozneListesi = Arrays.asList("Ben", "Sen", "Hasan", "Nurşah", "Elif", "Abdulrezzak", "Şehribanu", "Zeynelabidin", "Naki");
        List<String> nesneListesi = Arrays.asList("Bahçe", "Okul", "Park", "Sınıf", "Yarın", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma",  "Cumartesi", "Pazar", "Merkez", "Ev", "Kitap", "Defter", "Güneş", "Beydağı");
        List<String> yuklemListesi = Arrays.asList("Gitmek", "Gelmek", "Okumak", "Yazmak", "Yürümek", "Görmek");

        System.out.println("Lütfen üç kelimelik bir cümle girin (Özne Nesne Yüklem şeklinde):");
        String cumle = scanner.nextLine();

        String[] kelimeler = cumle.split(" ");

        if (kelimeler.length != 3) {
            System.out.println("Hata: Üç kelimelik bir cümle girmelisiniz.");
            return;
        }

        if (!ozneListesi.contains(kelimeler[0]) || !nesneListesi.contains(kelimeler[1]) || !yuklemListesi.contains(kelimeler[2])) {
            System.out.println("Hata: Geçersiz özne, nesne veya yüklem.");
            return;
        }

        System.out.println("Cümle geçerli.");
    }
}
