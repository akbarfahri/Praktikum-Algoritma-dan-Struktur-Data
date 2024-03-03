public class limassegiempat {
    
    double panjangSisiAlas;
    double tinggiLimas;

    public limassegiempat(double panjangSisiAlas, double tinggiLimas) {
        this.panjangSisiAlas = panjangSisiAlas;
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungLuasPermukaan() {
        return panjangSisiAlas * panjangSisiAlas + 4 * (0.5 * panjangSisiAlas) * Math.sqrt((panjangSisiAlas / 2.0) * (panjangSisiAlas / 2.0) + tinggiLimas * tinggiLimas);
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * panjangSisiAlas * panjangSisiAlas * tinggiLimas;
    }
}
