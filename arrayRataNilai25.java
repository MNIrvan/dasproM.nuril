import java.util.Scanner;
public class arrayRataNilai25 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = user.nextInt();
        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0, totalTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = user.nextInt();
            if (nilaiMhs[i] >= 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        } if (jumlahLulus > 0) {
            double rata2Lulus = totalLulus / jumlahLulus;
            System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus.");
        } if (jumlahTidakLulus > 0) {
            double rata2TidakLulus = totalTidakLulus / jumlahTidakLulus;
            System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);
        } else {
            System.out.println("Semua mahasiswa lulus.");
        }
        user.close();
    }
}
