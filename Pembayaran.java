interface CashbackPromo {
    double hitungCashback(); 
}

abstract class Pembayaran {
    protected String idTransaksi;
    protected double nominal;

    public Pembayaran(String idTransaksi, double nominal) {
        this.idTransaksi = idTransaksi;
        this.nominal = nominal;
    }

    public void tampilkanInfoDasar() {
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Nominal      : Rp" + nominal);
    }

    public abstract void prosesPembayaran();
}

