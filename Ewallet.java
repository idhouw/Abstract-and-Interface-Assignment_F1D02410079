class EWallet extends Pembayaran implements CashbackPromo {
    private String provider;

    public EWallet(String idTransaksi, double nominal, String provider) {
        super(idTransaksi, nominal);
        this.provider = provider;
    }

    @Override
    public double hitungCashback() {
        return this.nominal * 0.05; 
    }

    @Override
    public void prosesPembayaran() {
        tampilkanInfoDasar();
        double cashback = hitungCashback();
        System.out.println("Metode       : E-Wallet (" + provider + ")");
        System.out.println("Status       : Pembayaran Berhasil dipotong dari saldo " + provider);
        System.out.println("Bonus        : Anda mendapat cashback Rp" + cashback);
        System.out.println("--------------------------------------------------");
    }
}
