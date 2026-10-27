class TransferBank extends Pembayaran {
    private String namaBank;
    private double biayaAdmin = 2500;

    public TransferBank(String idTransaksi, double nominal, String namaBank) {
        super(idTransaksi, nominal);
        this.namaBank = namaBank;
    }

    @Override
    public void prosesPembayaran() {
        tampilkanInfoDasar();
        double totalBayar = nominal + biayaAdmin;
        System.out.println("Metode       : Transfer Bank (" + namaBank + ")");
        System.out.println("Biaya Admin  : Rp" + biayaAdmin);
        System.out.println("Total Bayar  : Rp" + totalBayar);
        System.out.println("Status       : Pembayaran Berhasil diverifikasi via Virtual Account");
        System.out.println("--------------------------------------------------");
    }
}