package pertemuan6;

/**
 *
 * @author Afra Syavina
 */
import java.util.Scanner;
public class ProgramTunjangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========Program Tunjangan========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = input.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        String status = input.next();

        double tunjangan = 0;
        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = 0.35 * gajiPokok;
        }

        double totalGaji = gajiPokok + tunjangan;

        System.out.println("\n========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok   : Rp " + gajiPokok);
        System.out.println("Tunjangan    : Rp " + tunjangan);
        System.out.println("Total Gaji   : Rp " + totalGaji);
        System.out.println("(Developed by : Rizki Adam Kurniawan)");
    }    
}
