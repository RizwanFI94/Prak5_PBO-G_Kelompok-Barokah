package RentalPS;


public abstract class RentalPS {
    protected String namaPenyewa;
    protected int lamaSewaJam;
    protected double hargaPerJam;
    
    abstract double hitungBiayaSewa();
    abstract void tampilkanInfo();
}
