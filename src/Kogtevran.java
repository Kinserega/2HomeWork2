public class Kogtevran extends Hogwarts{
    private int smart;
    private int wize;
    private int witty;
    private int creativity;

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWize() {
        return wize;
    }

    public void setWize(int wize) {
        this.wize = wize;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public Kogtevran(String name, int powerMagic, int transgressDistance, int smart, int wize, int witty, int creativity) {
        super(name, powerMagic, transgressDistance);
        this.smart = smart;
        this.wize = wize;
        this.witty = witty;
        this.creativity = creativity;

    }

}

