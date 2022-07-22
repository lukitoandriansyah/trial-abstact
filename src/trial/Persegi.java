package trial;

public class Persegi extends SegiEmpat{
    private int panjang;

    public Persegi(int panjang) {
        super();
        this.panjang = panjang;
    }

    @Override
    public double getLuas() {
        return panjang*panjang;
    }
}
