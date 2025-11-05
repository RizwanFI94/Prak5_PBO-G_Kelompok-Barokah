package RentalPS;

public class Main {
    public static void main(String[] args) {
        RentalPS5 sewa1 = new RentalPS5("Kelompok 5", 5, 10000);
        sewa1.tampilkanInfo();

        langganan pelanggan1 = new langganan(sewa1);
        pelanggan1.tampilkanBonus();
    }
}
