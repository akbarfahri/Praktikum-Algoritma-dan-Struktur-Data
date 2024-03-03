public class mahasiswa {
    private String nama;
    private String nim;
    private char jenisKelamin;
    private double ipk;

    public mahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    public void tampilkanInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jenis Kelamin (L/P): " + jenisKelamin);
        System.out.println("IPK : " + ipk);
    }

    public double getIpk() {
        return ipk;
    }
}

