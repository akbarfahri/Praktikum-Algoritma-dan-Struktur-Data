package kuis2praktikumASD;
import java.util.Scanner;

public class Main_21 {
    public static void main(String[] args) {
        Scanner sc21 = new Scanner(System.in);
        LinkedList antrian = new LinkedList();

        // Informasi pribadi saya
        String nama = "Muhammad Akbar Fakhriy Daffa";
        String nim = "2341720231";
        String absen = "21";

        // Mencetak informasi header
        System.out.println("======= QUIZ 2 PRAKTIKUM ASD TI 1G =======");
        System.out.println("dibuat oleh : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Absen : " + absen);
        System.out.println("===============================================");
        System.out.println("Sistem Antrian Resto KOH\n");

        // Loop untuk menu
        int pilihan = 0;
        while (pilihan != 5) {
            // Menampilkan menu
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = sc21.nextInt();
            sc21.nextLine(); 

            switch (pilihan) {
                case 1:
                    // Tambah Pesanan
                    System.out.print("Masukkan nama pembeli: ");
                    String namaPembeli = sc21.nextLine();
                    System.out.print("Masukkan nomor HP pembeli: ");
                    String nomorHP = sc21.nextLine();
                    pembeli_21 pembeli = new pembeli_21(namaPembeli, nomorHP);

                    System.out.print("Masukkan nama pesanan: ");
                    String namaPesanan = sc21.nextLine();
                    System.out.print("Masukkan harga pesanan: ");
                    int hargaPesanan = sc21.nextInt();
                    sc21.nextLine(); 

                    pesanan_21 pesanan = new pesanan_21(antrian.size() + 1, namaPesanan, pembeli, hargaPesanan);
                    antrian.tambahAntrian(pesanan);
                    break;

                case 2:
                    
                    antrian.cetakAntrian();
                    break;

                case 3:
                    
                    if (!antrian.isEmpty()) {
                        System.out.print("Masukkan nomor antrian yang akan dihapus: ");
                        int nomorAntrian = sc21.nextInt();
                        sc21.nextLine();
                        antrian.hapusAntrian(nomorAntrian);
                    } else {
                        System.out.println("Antrian kosong");
                    }
                    break;

                case 4:
                    
                    antrian.laporanPesanan();
                    break;

                case 5:
                    
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }

        sc21.close(); 
    }
}
    

