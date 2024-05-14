package Jobsheet5.BubbleSelectionInsertion.src.LATIHANPRAKTIKUM;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        Hotel r1 = new Hotel("Swiss Berlynn", "Kota Malang", 700000, (byte) 3);
        Hotel r2 = new Hotel("Fave Hotel", "Kota Malang", 625000, (byte) 2);
        Hotel r3 = new Hotel("De Braga", "Kota Bandung", 550000, (byte) 1);
        Hotel r4 = new Hotel("Raffles", "Bali", 1200000, (byte) 4);
        Hotel r5 = new Hotel("The Legian", "Bali", 2100000, (byte) 5);

        list.tambah(r1);
        list.tambah(r2);
        list.tambah(r3);
        list.tambah(r4);
        list.tambah(r5);

        Scanner sc17 = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("|             HOTEL INFORMATION              |");
        System.out.println("|1. Start from lowest into highest price     |");
        System.out.println("|2. Hotel Star Rating from highest to lowest |");
        System.out.println("----------------------------------------------");
        System.out.print("OPTION : ");
        int pilihan = sc17.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("----------------------------------------------");
                System.out.println("Sorting Hotel Based on the lowest price");
                list.bubbleSort();
                list.tampilAll();
                main(args);
                break;
            case 2:
                System.out.println("----------------------------------------------");
                System.out.println("Sorting Hotel Based on the highest price");
                list.selectionSort();
                list.tampilAll();
                main(args);
                break;

            default:
                System.out.println("There is no options");
                main(args);
                break;
        }
        sc17.close();
    }
}
