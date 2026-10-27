public class Main {
    public static void main(String[] args) {
        System.out.println("SISTEM PEMBAYARAN E-COMMERCE\n");

        Pembayaran transaksi1 = new EWallet("TRX-001", 100000, "GoPay");
        Pembayaran transaksi2 = new TransferBank("TRX-002", 250000, "BCA");

        transaksi1.prosesPembayaran();
        transaksi2.prosesPembayaran();
    }
}