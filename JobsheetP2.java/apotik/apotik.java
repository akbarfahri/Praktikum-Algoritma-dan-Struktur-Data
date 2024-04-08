package apotik;
import java.util.Scanner;

public class apotik {
    public static void main(String[] args) {
        Scanner sc21 = new Scanner(System.in);
        Obat[] obat = new Obat[5];

        // Get user input for each medicine
        for (int i = 0; i < obat.length; i++) {
            System.out.println("Masukan data untuk obat ke-" + (i + 1));
            System.out.print("Nama obat: ");
            String nama = sc21.nextLine();
            System.out.print("Kategori obat: ");
            String kategori = sc21.nextLine();
            System.out.print("Stok obat: ");
            int stok = sc21.nextInt();
            System.out.print("Jumlah terjual: ");
            int jumlah = sc21.nextInt();
            obat[i] = new Obat(nama, kategori, stok, jumlah);
            sc21.nextLine(); // Clear the scanner buffer
        }

        
        System.out.println("\nData semua obat:");
        for (Obat ob : obat) {
            ob.tampil();
        }

        
        System.out.println("\nSisa stok obat:");
        for (Obat ob : obat) {
            System.out.println(ob.getNama() + ": " + ob.hitungSisa());
        }

        
        Obat obatPalingLaku = obat[0];
        for (Obat ob : obat) {
            if (ob.getJumlah() > obatPalingLaku.getJumlah()) {
                obatPalingLaku = ob;
            }
        }
        System.out.println("\nObat paling laku:");
        obatPalingLaku.tampil();

        
        System.out.println("\nDaftar obat diurutkan berdasarkan stok:");
        for (int i = 0; i < obat.length - 1; i++) {
            for (int j = i + 1; j < obat.length; j++) {
                if (obat[i].getStok() > obat[j].getStok()) {
                    Obat temp = obat[i];
                    obat[i] = obat[j];
                    obat[j] = temp;
                }
            }
        }
        for (Obat ob : obat) {
            ob.tampil();
        }
    }
}

class Obat {
    private String nama;
    private String kategori;
    private int stok;
    private int jumlah;

    public Obat(String nama, String kategori, int stok, int jumlah) {
        this.nama = nama;
        this.kategori = kategori;
        this.stok = stok;
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
        System.out.println("Jumlah terjual: " + jumlah);
        System.out.println();
    }

    public int hitungSisa() {
        return stok - jumlah;
    }
}