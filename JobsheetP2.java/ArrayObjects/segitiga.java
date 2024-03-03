package ArrayObjects;

public class segitiga {
    public int alas;
    public int tinggi;
    
    public segitiga (int a, int t) {
        alas = a;
        tinggi = t;

    
    }
    public double hitungluas() {
        return 0.5 * alas * tinggi;

    }
    public double hitungkeliling() {
        double sisimiring = Math.sqrt(alas * alas + tinggi * tinggi);
        return (int)alas + (int)tinggi + (int)sisimiring;
        
        segitiga [] sgArray = new segitiga[4];

        sgArray[0] = new segitiga(10, 4);
        sgArray[1] = new segitiga(20, 10);
        sgArray[2] = new segitiga(15, 6);
        sgArray[3] = new segitiga(25, 10);

        for (int i = 0; , sgArray.length; i++) {
            System.out.println("Segitiga ke-" +i);
            System.out.println("Luas: " sgArray[i].hitungluas());
            System.out.println("Keliling: " sgArray[i].hitungkeliling());
            System.out.println();
            

        }
    }
    }
    

