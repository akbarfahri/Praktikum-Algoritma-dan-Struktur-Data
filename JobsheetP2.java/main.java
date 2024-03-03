import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input untuk Kerucut
        System.out.println("Input atribut untuk Kerucut:");
        System.out.print("Jari-jari: ");
        double jariJariKerucut = scanner.nextDouble();
        System.out.print("Sisi miring: ");
        double sisiMiringKerucut = scanner.nextDouble();

        kerucut kerucut = new kerucut(jariJariKerucut, sisiMiringKerucut);
        System.out.println("Luas Permukaan Kerucut: " + kerucut.hitungLuasPermukaan());
        System.out.println("Volume Kerucut: " + kerucut.hitungVolume());

        // Input untuk Limas Segi Empat Sama Sisi
        System.out.println("\nInput atribut untuk Limas Segi Empat Sama Sisi:");
        System.out.print("Panjang sisi alas: ");
        double panjangSisiAlasLimas = scanner.nextDouble();
        System.out.print("Tinggi limas: ");
        double tinggiLimas = scanner.nextDouble();

        limassegiempat limas = new limassegiempat(panjangSisiAlasLimas, tinggiLimas);
        System.out.println("Luas Permukaan Limas Segi Empat Sama Sisi: " + limas.hitungLuasPermukaan());
        System.out.println("Volume Limas Segi Empat Sama Sisi: " + limas.hitungVolume());

        // Input untuk Bola
        System.out.println("\nInput atribut untuk Bola:");
        System.out.print("Jari-jari: ");
        double jariJariBola = scanner.nextDouble();

        bola bola = new bola(jariJariBola);
        System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaan());
        System.out.println("Volume Bola: " + bola.hitungVolume());

        scanner.close();
    }
}
    
    

