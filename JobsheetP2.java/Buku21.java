class Buku21 {
String judul, pengarang;
int halaman, stok, harga, terjual;
public Buku21() {

    }
    public Buku21(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;

    }
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
            terjual= jml;
        }
    }
    void restock(int jml) {
        stok += jml;
    }
    void  gantiHarga(int hrg) {
        harga = hrg;
    }
    int hitunghargaTotal(){
        int hargaTot = terjual * harga;
        return hargaTot;
    }
    int hitungDiskon(){
        if (hitunghargaTotal()> 150000) {
        double diskon = hitunghargaTotal() * 0.12;
        int intDiskon = (int)diskon;
        return intDiskon;
    } else if ((hitunghargaTotal() > 75000) && (hitunghargaTotal() <= 150000)){
        double diskon = hitunghargaTotal() * 0.05;
        int intDiskon = (int)diskon;
        return intDiskon;
    } else {
        double diskon = hitunghargaTotal() * 0;
        int intDiskon = (int)diskon;
        return intDiskon;
    }
    }
    int hitunghargabayar(){
        int hargatotal = hitunghargaTotal() - hitungDiskon();
        return hargatotal;
    }
}
