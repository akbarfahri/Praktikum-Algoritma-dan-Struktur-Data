package kuis2praktikumASD;

public class pesanan_21 {
    int KodePesanan;
    String NamaPesanan;
    pembeli_21 pembeli;
    int harga;

    public pesanan_21(int i, String namaPesanan2, pembeli_21 pembeli2, int hargaPesanan) {
        
    }

    public void Pesanan(int KodePesanan, String NamaPesanan, pembeli_21 pembeli, int harga){
        this.KodePesanan = KodePesanan;
        this.NamaPesanan = NamaPesanan;
        this.pembeli = pembeli;
        this.harga = harga;
    }

    public void denda(int a, String b, int d){
        System.out.println("Pesanan dengan kode : " + a + " dan nama : " + b + " dikenakan denda : " + d);
    }
}

