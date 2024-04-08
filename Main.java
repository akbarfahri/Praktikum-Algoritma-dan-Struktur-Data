package Jobsheet5.BubbleSelectionInsertion.src;

public class Main {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Adjie", 2023, 19, 4.00);
        Mahasiswa m2 = new Mahasiswa("Satria", 2022, 20, 3.90);
        Mahasiswa m3 = new Mahasiswa("Riska", 2020, 22, 3.65);
        Mahasiswa m4 = new Mahasiswa("Bagas", 2021, 21, 3.45);
        Mahasiswa m5 = new Mahasiswa("Sofia", 2023, 19, 3.8);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertionSort();
        list.tampil();
    }
}
