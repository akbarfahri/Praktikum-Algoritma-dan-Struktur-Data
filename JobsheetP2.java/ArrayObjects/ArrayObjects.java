package ArrayObjects;
import java.util.Scanner;
public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc21 = new Scanner(System.in);

        System.out.println("Masukkan panjang array : ");
        int banyakArr = sc21.nextInt();
        persegipanjang[] ppArray = new persegipanjang[banyakArr];
        

        for (int i = 0; i < 3; i++) {
            ppArray[i] = new persegipanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Masukkan Panjang : ");
            ppArray[i].panjang = sc21.nextInt();
            System.out.println("Masukkan Lebar : ");
            ppArray[i].lebar = sc21.nextInt();
        }
        System.out.println("=======================");
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" +i);
            System.out.println("Panjang : " + ppArray[i].panjang + " Lebar : " + ppArray[i].lebar);
            System.out.println("================================================================");
        }
    }
}
