package trial;

public /*abstract*/ class SegiEmpat extends BidangDatar{
    private int panjang;
    private int lebar;

    public SegiEmpat(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double getLuas() {
        return panjang*lebar;
    }

    public SegiEmpat(){}
}
