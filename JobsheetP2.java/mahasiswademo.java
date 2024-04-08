import java.util.Scanner;
public class mahasiswademo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        mahasiswa[] arrayMahasiswa = new mahasiswa[jumlahMahasiswa];

        // Input informasi mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            scanner.nextLine(); // Membersihkan newline buffer
            System.out.println("Data Mahasiswa " + (i + 1) + " :");

            System.out.print("Nama : ");
            String nama = scanner.nextLine();

            System.out.print("NIM : ");
            String nim = scanner.nextLine();

            System.out.print("Jenis Kelamin : ");
            char jenisKelamin = scanner.next().charAt(0);

            System.out.print("IPK : ");
            double ipk = scanner.nextDouble();

            arrayMahasiswa[i] = new mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        // Tampilkan informasi mahasiswa
        System.out.println("\nInformasi Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Data Mahasiswa " + (i + 1) + " :");
            arrayMahasiswa[i].tampilkanInfo();
        }

        // Hitung rata-rata IPK
        double totalIpk = 0;
        for (mahasiswa mahasiswa : arrayMahasiswa) {
            totalIpk += mahasiswa.getIpk();
        }
        double rataRataIpk = totalIpk / jumlahMahasiswa;

        System.out.println("\nRata-rata IPK: " + rataRataIpk);

        // Temukan mahasiswa dengan IPK terbesar
        mahasiswa mahasiswaTerbaik = arrayMahasiswa[0];
        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (arrayMahasiswa[i].getIpk() > mahasiswaTerbaik.getIpk()) {
                mahasiswaTerbaik = arrayMahasiswa[i];
            }
        }

        // Tampilkan informasi mahasiswa dengan IPK terbesar
        System.out.println("\nMahasiswa dengan IPK Terbesar:");
        mahasiswaTerbaik.tampilkanInfo();

        // Close the scanner after using it
        scanner.close();
    }
}

    
    

