class Buku21 {
String judul, pengarang;
int halaman, stok, harga;
    void tampilinformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok:  " + stok);
        System.out.println("Harga: Rp " + harga);

    }
    void terjual (int jml) {
        if (stok>0) {
            stok -= jml;
        }
    }
    void restock(int jml) {
        stok += jml;
    }
    void  gantiHarga(int hrg) {
        harga = hrg;
    }
}
