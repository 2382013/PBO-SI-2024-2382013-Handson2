import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.Scanner;
public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nomorHari;
        System.out.println("Masukkan nomor diantara 1 samapi 7 :");
        nomorHari = scanner.nextInt();
        String namaHari = "";

        if (nomorHari == 1) {
            namaHari = "Minggu";

        } else if (nomorHari == 2) {
            namaHari = "Senin";
        } else if (nomorHari == 3) {
            namaHari = "Selasa";
        } else if (nomorHari == 4) {
            namaHari = "Rabu";
        } else if (nomorHari == 5) {
            namaHari = "Kamis";
        } else if (nomorHari == 6) {
            namaHari = "Jumat";
        } else if (nomorHari == 7) {
            namaHari = "Sabtu";
        }
    }
}