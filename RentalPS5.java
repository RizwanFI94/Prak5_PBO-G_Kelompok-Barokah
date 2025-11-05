package RentalPS;

public class RentalPS5 extends RentalPS implements bonusMember {

    public RentalPS5(String namaPenyewa, int lamaSewaJam, double hargaPerJam) {
        this.namaPenyewa = namaPenyewa;
        this.lamaSewaJam = lamaSewaJam;
        this.hargaPerJam = hargaPerJam;
    }

    @Override
    double hitungBiayaSewa() {
        return lamaSewaJam * hargaPerJam;
    }

    @Override
    public double beriBonus() {
        return hitungBiayaSewa() * 0.05;
    }

    @Override
    void tampilkanInfo() {
        System.out.println("=== DATA PENYEWA PS5 ===");
        System.out.println("Nama Penyewa   : " + namaPenyewa);
        System.out.println("Lama Sewa (jam): " + lamaSewaJam);
        System.out.println("Harga per Jam  : " + hargaPerJam);
        System.out.println("Total Biaya    : " + hitungBiayaSewa());
        System.out.println("Bonus Member   : " + beriBonus());
    }
}
